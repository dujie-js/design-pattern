package com.js.common.abstracts.impl;

import com.js.common.abstracts.Component;
import com.js.common.abstracts.Decorator;

/**
 * @Description: 具体装饰器
 * @Author: 渡劫 dujie
 * @Date: 2021/6/4 11:46 AM
 * @return
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    private void operationFirst() {
        System.out.println("ConcreteDecoratorB start");
    }

    private void operationLast() {
        System.out.println("ConcreteDecoratorB end");
    }

    @Override
    public void operation() {
        /**执行哪些方法可以自由定义**/
        operationFirst();
        super.operation();
        operationLast();
    }
}
