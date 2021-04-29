package com.js.duotaiproxy.person;

import com.js.duotaiproxy.intefaces.IPerson;

public class ZhangSan implements IPerson {
    @Override
    public void findLove() {
        System.out.println("张三提出要求");
    }
}
