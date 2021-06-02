package com.js.handler;

/**
 * @Description: 首先定义抽象处理者
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/5/12 1:44 PM
 * @return
 */
public abstract class Handler {

    /**
     * 下一个Handler
     */
    protected Handler nextHandler;

    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    public abstract void handleRequest(String request);
}
