package com.js.duotaiproxy.person;

import com.js.duotaiproxy.intefaces.IPerson;

public class ZhangLaoSan implements IPerson {
    private ZhangSan zhangSan;

    public ZhangLaoSan(ZhangSan zhangSan) {
        this.zhangSan = zhangSan;
    }

    @Override
    public void findLove() {
        System.out.println("张老三开始寻找");
        zhangSan.findLove();
        System.out.println("张老三任务结束");
    }
}
