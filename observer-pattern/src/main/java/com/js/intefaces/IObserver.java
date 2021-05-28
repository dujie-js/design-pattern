package com.js.intefaces;

/**
 * @Description: 抽象观察者
 * @Author: 渡劫 dujie
 * @Date: 2021/5/28 11:11 AM
 * @return
 */
public interface IObserver<E> {
    void update(E event);
}
