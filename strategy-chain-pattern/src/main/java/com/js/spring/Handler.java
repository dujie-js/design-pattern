package com.js.spring;

import com.js.spring.intefaces.MyOrder;

public abstract class Handler<S,R> implements MyOrder {
    protected Handler<S,R> nextHandler;

    public abstract S doHandle(R request);

    public abstract Handler<S,R> getNextHandler();

    public void setNextHandler(Handler<S,R> handler) {
        this.nextHandler = handler;
    }
}
