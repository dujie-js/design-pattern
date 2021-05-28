package com.js.intefaces.impl;

import com.js.intefaces.IObserver;
/**
 * @Description: 具体观察者
 * @Author: 渡劫 dujie
 * @Date: 2021/5/28 11:31 AM
 * @return
 */
public class ConcreteObserver<E> implements IObserver<E> {
    @Override
    public void update(E event) {
        System.out.println("receive event  :" + event);
    }
}
