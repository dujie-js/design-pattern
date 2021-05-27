package com.js.kpi.intefaces.impl;

import com.js.kpi.abstrat.impl.Engineer;
import com.js.kpi.abstrat.impl.Manager;
import com.js.kpi.intefaces.IVisitor;

public class CeoVisitor implements IVisitor {
    @Override
    public void visit(Manager manager) {
        System.out.println("经理逻辑");
    }

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师逻辑");
    }
}
