package com.js.old.interfaces.impl;

import com.js.old.interfaces.IState;

public class ConcreteStateB implements IState {
    @Override
    public void handle() {
        System.out.println("StateB do action");
    }
}
