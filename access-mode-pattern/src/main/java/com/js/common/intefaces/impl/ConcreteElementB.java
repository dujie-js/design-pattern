package com.js.common.intefaces.impl;

import com.js.common.intefaces.IElement;
import com.js.common.intefaces.IVisitor;

import java.util.Random;

public class ConcreteElementB implements IElement {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public int operationB() {
        return new Random().nextInt(100);
    }
}
