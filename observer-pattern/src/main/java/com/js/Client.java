package com.js;

import com.js.intefaces.IObserver;
import com.js.intefaces.ISubject;
import com.js.intefaces.impl.ConcreteObserver;
import com.js.intefaces.impl.ConcreteSubject;

public class Client {
    public static void main(String[] args) {
        ISubject<String> observable = new ConcreteSubject<>();

        IObserver<String> observer = new ConcreteObserver<>();
        observable.notify("Hello ");

        observable.attach(observer);

        observable.notify("Hello ");
    }

}
