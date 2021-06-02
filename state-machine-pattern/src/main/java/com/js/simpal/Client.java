package com.js.simpal;


import com.js.simpal.abstrat.impl.ConcreteStateA;
import com.js.simpal.context.Context;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateA());
        context.handle();
    }
}
