package com.js.old;

import com.js.old.interfaces.impl.ConcreteStateB;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateB());
        context.handle();
    }
}
