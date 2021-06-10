package com.js.common.intefaces.impl;

import com.js.common.intefaces.Task;

public class ConcreteB implements Task {
    @Override
    public void doTask() {
        System.out.println("执行，由 B 实现");
    }
}
