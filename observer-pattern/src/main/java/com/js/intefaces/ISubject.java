package com.js.intefaces;

/**
 * @Description: 抽象主题者
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/5/28 11:20 AM
 * @return
 */
public interface ISubject<E> {

    boolean attach(IObserver<E> observer);

    boolean detach(IObserver<E> observer);

    void notify(E event);
}
