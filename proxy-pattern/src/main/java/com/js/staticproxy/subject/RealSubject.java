package com.js.staticproxy.subject;

import com.js.staticproxy.intefaces.ISubject;

public class RealSubject implements ISubject {
    @Override
    public void request() {
        System.out.println("方法真正执行");
    }
}
