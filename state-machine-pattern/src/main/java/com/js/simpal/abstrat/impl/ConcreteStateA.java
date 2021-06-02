package com.js.simpal.abstrat.impl;

import com.js.simpal.abstrat.State;
import com.js.simpal.context.Context;

public class ConcreteStateA extends State {
    @Override
    public void handle() {
        System.out.println("StateA do action");
        this.context.setState(Context.STATEB);
        this.context.getState().handle();
    }
}
