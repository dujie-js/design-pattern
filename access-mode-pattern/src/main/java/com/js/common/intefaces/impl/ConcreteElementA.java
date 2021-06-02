package com.js.common.intefaces.impl;

import com.js.common.intefaces.IElement;
import com.js.common.intefaces.IVisitor;

public class ConcreteElementA implements IElement {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return this.getClass().getSimpleName();
    }
}
