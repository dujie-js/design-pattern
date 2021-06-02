package com.js;

import com.js.intefaces.IFactory;
import com.js.intefaces.impl.FactoryA;
import com.js.intefaces.impl.FactoryB;
import com.js.intefaces.impl.FactoryC;

public class Client {
    public static void main(String[] args) {
        IFactory factory = new FactoryA();
        factory.makeProduct().doSomething();
        factory = new FactoryB();
        factory.makeProduct().doSomething();
        factory = new FactoryC();
        factory.makeProduct().doSomething();

    }
}
