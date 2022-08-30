package com.js.spring;

import com.js.spring.intefaces.MyOrder;

public abstract class Handler implements MyOrder {
    protected Handler nextHandler;

    public abstract void doHandle(Integer num);

    public abstract Handler getNextHandler();

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
