package com.js.common;

import com.js.common.intefaces.IVisitor;
import com.js.common.intefaces.ObjectStructure;
import com.js.common.intefaces.impl.ConcreteVistorA;
import com.js.common.intefaces.impl.ConcreteVistorB;

public class Client {
    public static void main(String[] args) {
        ObjectStructure collection = new ObjectStructure();
        System.out.println("ConcreteA handle ele");
        IVisitor visitorA = new ConcreteVistorA();
        collection.accept(visitorA);


        System.out.println("ConcreteB handle ele");
        IVisitor visitorB = new ConcreteVistorB();
        collection.accept(visitorB);
    }
}
