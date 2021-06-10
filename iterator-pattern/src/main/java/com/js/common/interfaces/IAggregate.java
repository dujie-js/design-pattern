package com.js.common.interfaces;

/**
 * @Description: 抽象容器
 * @Author: 渡劫 dujie
 * @Date: 2021/6/10 10:04 AM
 * @return
 */
public interface IAggregate<E> {

    boolean add(E element);

    boolean remove(E element);

    Iterator<E> iterator();
}
