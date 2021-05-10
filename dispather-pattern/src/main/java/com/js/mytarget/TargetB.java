package com.js.mytarget;

import com.js.intefaces.ITarget;

public class TargetB implements ITarget {

    @Override
    public void doSomeThing(String commond) {
        System.out.println("我是员工B,我擅长解密，我现在开始干：" + commond);
    }
}