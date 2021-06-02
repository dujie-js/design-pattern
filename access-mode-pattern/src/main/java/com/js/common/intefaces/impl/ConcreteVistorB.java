package com.js.common.intefaces.impl;

import com.js.common.intefaces.IVisitor;

public class ConcreteVistorB implements IVisitor {
    @Override
    public void visit(ConcreteElementA element) {
        String result = element.operationA();
        System.out.println("result from " + element.getClass().getSimpleName() + ":" + result);
    }

    @Override
    public void visit(ConcreteElementB element) {
        int result = element.operationB();
        System.out.println("result from " + element.getClass().getSimpleName() + ":" + result);
    }
}
