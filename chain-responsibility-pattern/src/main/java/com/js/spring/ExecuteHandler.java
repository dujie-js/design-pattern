package com.js.spring;

import cn.hutool.core.collection.CollectionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Gabriel
 * @date: 2020/3/15 23:53
 * @description 职责处理器
 */
@Component
public class ExecuteHandler {

    @Autowired
    private ApplicationContext context;

    private List<Handler> handlerList = new LinkedList<Handler>();

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    /**
     * 该方法会在该对象创建之后被调用
     *
     * @throws Exception
     */
    @PostConstruct
    public void afterPostConstruct() throws Exception {
        HandlerBeanEnum[] values = HandlerBeanEnum.values();
        for (HandlerBeanEnum value : values) {
            Handler bean = context.getBean(value.getBeanName(), Handler.class);
            handlerList.add(bean);
        }
        if (CollectionUtil.isNotEmpty(handlerList)) {
            for (int i = 1; i < handlerList.size(); i++) {
                //当前处理器
                Handler currentHandler = handlerList.get(i - 1);
                //下一个处理器
                Handler nextHandler = handlerList.get(i);
                //将处理器串成链表
                currentHandler.setNextHandler(nextHandler);
            }
            this.handler = handlerList.get(0);
        }

    }

}