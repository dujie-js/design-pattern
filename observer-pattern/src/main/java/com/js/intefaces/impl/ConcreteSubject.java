package com.js.intefaces.impl;

import com.js.intefaces.IObserver;
import com.js.intefaces.ISubject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 具体主题着
 * @Author: 渡劫 dujie
 * @Date: 2021/5/28 11:33 AM
 * @return
 */
public class ConcreteSubject<E> implements ISubject<E> {

    private List<IObserver<E>> observerList = new ArrayList<>();

    @Override
    public boolean attach(IObserver<E> observer) {
        return !this.observerList.contains(observer) && this.observerList.add(observer);
    }

    @Override
    public boolean detach(IObserver<E> observer) {
        return this.observerList.remove(observer);
    }

    @Override
    public void notify(E event) {
        for (IObserver<E> eiObserver : this.observerList) {
            eiObserver.update(event);
        }
    }
}
