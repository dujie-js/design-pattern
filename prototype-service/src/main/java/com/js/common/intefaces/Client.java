package com.js.common.intefaces;

import com.js.common.intefaces.impl.ConcretePrototypeA;

/**
 * 原型模式的通用写法
 **/
public class Client {
    public static void main(String[] args) {
        ConcretePrototypeA prototypeA = new ConcretePrototypeA("ConcretePrototypeA");

        System.out.println(prototypeA);

        ConcretePrototypeA prototypeAClone = prototypeA.clone();
        prototypeAClone.setDesc("prototypeAClone");

        System.out.println(prototypeA);
        System.out.println(prototypeAClone);

    }
}
