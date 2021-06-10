package com.js.common.concrete;

import com.js.common.interfaces.Iterator;

import java.util.List;

// 具体的迭代器
public class ConcreteIterator<E> implements Iterator<E> {
    private List<E> list;

    private int cursor = 0;

    public ConcreteIterator(List<E> list) {
        this.list = list;
    }

    @Override
    public E next() {
        return list.get(cursor++);
    }

    @Override
    public boolean hasNext() {
        return this.cursor < this.list.size();
    }
}
