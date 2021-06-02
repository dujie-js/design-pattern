package com.js.simpal.context;


import com.js.simpal.abstrat.State;
import com.js.simpal.abstrat.impl.ConcreteStateA;
import com.js.simpal.abstrat.impl.ConcreteStateB;

public class Context {
    public static final State STATEA = new ConcreteStateA();

    public static final State STATEB = new ConcreteStateB();

    private State currentState = STATEA;

    {
        STATEA.setContext(this);
        STATEB.setContext(this);
    }

    public void setState(State state) {
        this.currentState = state;
        this.currentState.setContext(this);
    }

    public State getState() {
        return this.currentState;
    }

    public void handle() {
        this.currentState.handle();
    }
}
