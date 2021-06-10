package com.js.mycourse.aggregate;

import com.js.mycourse.intefaces.Iterator;

import java.util.List;

public class IteratorImpl<E> implements Iterator<E> {

    private List<E> list;

    private int cousor;

    private E element;

    public IteratorImpl(List<E> list) {
        this.list = list;
    }

    @Override
    public E next() {
        System.out.println("当前位置" + cousor);
        element = list.get(cousor);
        cousor++;
        return element;
    }

    @Override
    public boolean hasNext() {
        if (cousor > list.size() - 1) {
            return false;
        }
        return true;
    }
}
