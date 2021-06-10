package com.js.mycourse.intefaces;

/**
 * @Description: 抽象迭代器
 * @Date: 2021/6/10 10:02 AM
 * @return
 */
public interface Iterator<E> {

    E next();

    boolean hasNext();
}
