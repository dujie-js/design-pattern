package com.js.old;

import com.js.old.interfaces.IState;
import com.js.old.interfaces.impl.ConcreteStateA;
import com.js.old.interfaces.impl.ConcreteStateB;

public class Context {
    private static final IState STATEA = new ConcreteStateA();

    private static final IState STATEB = new ConcreteStateB();

    private IState currentState = STATEA;

    public void setState(IState state) {
        this.currentState = state;
    }

    public void handle() {
        this.currentState.handle();
    }
}
