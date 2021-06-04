package com.js.common;

import com.js.common.abstracts.Component;
import com.js.common.abstracts.Decorator;
import com.js.common.abstracts.impl.ConcreteComponent;
import com.js.common.abstracts.impl.ConcreteDecoratorA;
import com.js.common.abstracts.impl.ConcreteDecoratorB;

/**
 * @Description: 装饰器模式通用写法
 * @Author: 渡劫 dujie
 * @Date: 2021/6/4 11:53 AM
 * @return
 */
public class Client {

    public static void main(String[] args) {
        // 首先创建需要被装饰的原始对象
        Component c1 = new ConcreteComponent();
        Decorator decoratorA = new ConcreteDecoratorA(c1);
        decoratorA.operation();

        //给对象透明的增加功能B并且调用
        Decorator decoratorB = new ConcreteDecoratorA(c1);
        decoratorB.operation();

        Decorator decoratorBandA = new ConcreteDecoratorB(decoratorA);
        decoratorBandA.operation();

    }
}
