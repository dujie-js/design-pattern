package com.js.member.chain;

import com.js.member.normal.Member;

public abstract class Handler {
    protected Handler chain;

    public void next(Handler handler){
        this.chain = handler;
    }

    public abstract void doHandle(Member member);
}
