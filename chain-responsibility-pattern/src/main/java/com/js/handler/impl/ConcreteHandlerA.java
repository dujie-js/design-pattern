package com.js.handler.impl;

import com.js.handler.Handler;

public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("requestA".equals(request)) {
            System.out.println(this.getClass().getSimpleName() + "deal with request " + request);
            return;
        }
        if (this.nextHandler != null) {
            this.nextHandler.handleRequest(request);
        }
    }
}
