package com.js.simpal.abstrat.impl;

import com.js.simpal.abstrat.State;

public class ConcreteStateB extends State {
    @Override
    public void handle() {
        System.out.println("StateB do action");
    }
}
