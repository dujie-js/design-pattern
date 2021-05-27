package com.js.common.intefaces;

import com.js.common.intefaces.impl.ConcreteElementA;
import com.js.common.intefaces.impl.ConcreteElementB;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<IElement> list = new ArrayList<>();
    {
        this.list.add(new ConcreteElementA());
        this.list.add(new ConcreteElementB());
    }
    public void accept(IVisitor visitor){
        for (IElement element: list) {
            element.accept(visitor);
        }
    }
}
