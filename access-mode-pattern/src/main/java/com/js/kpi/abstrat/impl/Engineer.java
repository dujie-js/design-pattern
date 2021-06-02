package com.js.kpi.abstrat.impl;


import com.js.kpi.abstrat.Employee;
import com.js.kpi.intefaces.IVisitor;

import java.util.Random;

public class Engineer extends Employee {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public int getProducts() {
        return new Random().nextInt(10);
    }
}
