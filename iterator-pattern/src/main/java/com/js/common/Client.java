package com.js.common;

import com.js.common.concrete.ConcreteAggregate;
import com.js.common.interfaces.IAggregate;
import com.js.common.interfaces.Iterator;

public class Client {

    public static void main(String[] args) {
        // 创建容器对象
        IAggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("one");
        aggregate.add("two");
        aggregate.add("three");

        Iterator<String> iterator = aggregate.iterator();

        while (iterator.hasNext()) {
            String el = iterator.next();
            System.out.println(el);
        }
    }
}
