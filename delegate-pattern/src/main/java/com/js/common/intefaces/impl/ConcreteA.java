package com.js.common.intefaces.impl;

import com.js.common.intefaces.Task;

public class ConcreteA implements Task {
    @Override
    public void doTask() {
        System.out.println("执行，由 A 实现");
    }
}
