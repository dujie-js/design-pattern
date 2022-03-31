package com.js.spring.config;

import com.js.spring.domain.Order;
import com.js.spring.enums.LoanActionEnum;
import com.js.spring.enums.OrderStatus;
import com.js.spring.enums.OrderStatusChangeEvent;
import com.js.statemachine.entity.StatemachineConfig;
import com.js.statemachine.service.StatemachineConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.StateMachineContext;
import org.springframework.statemachine.StateMachinePersist;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.StateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;
import org.springframework.statemachine.persist.DefaultStateMachinePersister;
import org.springframework.statemachine.support.DefaultStateMachineContext;

import java.util.EnumSet;
import java.util.List;

/**
 * 订单状态机配置
 */
@Configuration
@EnableStateMachine(name = "loanStateMachiner")
public class LoanStateMachineConfig extends StateMachineConfigurerAdapter<OrderStatus, OrderStatusChangeEvent> {

    @Autowired
    private StatemachineConfigService statemachineConfigService;
    /**
     * 配置状态
     *
     * @param states
     * @throws Exception
     */
    @Override
    public void configure(StateMachineStateConfigurer<OrderStatus, OrderStatusChangeEvent> states) throws Exception {
        states.withStates().initial(OrderStatus.WAIT_PAYMENT).states(EnumSet.allOf(OrderStatus.class));
    }

    /**
     * 配置状态转换事件关系 如果对应场景的灵活依赖数据库的设想
     *
     * @param transitions
     * @throws Exception
     */
    @Override
    public void configure(StateMachineTransitionConfigurer<OrderStatus, OrderStatusChangeEvent> transitions) throws Exception {
        // 1、首先过滤当前场景对应的所有状态
        // 2、不同渠道对应的目标会有区别 好像Spring的状态机默认在项目初始化时所以我们需要规定当前场景尽可能完整的操作动作
        // 3、遍历初始化状态机相关参数对应一个渠道配置一套状态机不现实
        // 4、每对应一个场景对应一套状态机配置
        StatemachineConfig statemachineConfig = new StatemachineConfig();
        List<StatemachineConfig> statemachineConfigs = statemachineConfigService.find(statemachineConfig);
        for (StatemachineConfig config : statemachineConfigs) {
            transitions.withExternal().source(LoanActionEnum.getOrder(config.getSource())).target(LoanActionEnum.getOrder(config.getTarget())).event(OrderStatusChangeEvent.DELIVERY);
        }

    }

    /**
     * 持久化配置
     * 在实际使用中，可以配合Redis等进行持久化操作
     *
     * @return
     */
    @Bean
    public DefaultStateMachinePersister persister() {
        return new DefaultStateMachinePersister<>(new StateMachinePersist<Object, Object, Order>() {
            @Override
            public void write(StateMachineContext<Object, Object> context, Order order) {
                //此处并没有进行持久化操作
            }

            @Override
            public StateMachineContext<Object, Object> read(Order order) {
                //此处直接获取Order中的状态，其实并没有进行持久化读取操作
                return new DefaultStateMachineContext(order.getStatus(), null, null, null);
            }
        });
    }
}
