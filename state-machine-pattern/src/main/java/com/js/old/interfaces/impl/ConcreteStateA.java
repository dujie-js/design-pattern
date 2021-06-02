package com.js.old.interfaces.impl;

import com.js.old.interfaces.IState;

public class ConcreteStateA implements IState {
    @Override
    public void handle() {
        System.out.println("StateA do action");
    }
}
