package com.js.simpal.abstrat;

import com.js.simpal.context.Context;

/**
 * @Description: 抽象状态类
 * @Date: 2021/6/2 1:00 PM
 * @return
 */
public abstract class State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void handle();
}
