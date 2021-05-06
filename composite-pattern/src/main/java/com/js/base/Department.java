package com.js.base;

import com.js.intefaces.OrganizationComponent;

public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    //不在需要编写 add 和remove 方法
    @Override
    public void print() {
        System.out.println(getName());
    }
}

