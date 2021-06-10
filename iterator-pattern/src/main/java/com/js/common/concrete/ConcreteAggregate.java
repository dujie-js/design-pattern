package com.js.common.concrete;

import com.js.common.interfaces.IAggregate;
import com.js.common.interfaces.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<E> implements IAggregate<E> {

    private List<E> list = new ArrayList<>();

    @Override
    public boolean add(E element) {
        return list.add(element);
    }

    @Override
    public boolean remove(E element) {
        return list.remove(element);
    }

    @Override
    public Iterator<E> iterator() {
        return new ConcreteIterator<>(list);
    }
}
