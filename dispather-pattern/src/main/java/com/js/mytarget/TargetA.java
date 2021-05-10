package com.js.mytarget;

import com.js.intefaces.ITarget;

public class TargetA implements ITarget {
    @Override
    public void doSomeThing(String commond) {
        System.out.println("我是员工A,我擅长加密，我现在开始干：" + commond);
    }
}
