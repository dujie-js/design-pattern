package com.js.spring;

public abstract class Handler {
    protected Handler nextHandler;

    public abstract void doHandle(Integer num);

    public abstract Handler getNextHandler();

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
