package com.js.staticproxy.proxy;

import com.js.staticproxy.intefaces.ISubject;

/**
 * @Description: 静态代理
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/4/28 5:54 PM
 * @return
 */
public class Proxy implements ISubject {
    private ISubject subject;

    public Proxy(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    private void after() {
        System.out.println("方法执行之后");
    }

    private void before() {
        System.out.println("方法执行之前");
    }

}
