package com.js.intefaceadapt;

import com.js.intefaceadapt.abstracts.PassportForThirdAdapter;
import com.js.normal.interfaces.IPassportForThird;

public class Test {
    /**
     * 适配器模式主要解决的是功能兼容问题，复杂场景的适配容易和策略模式混淆
     */
    public static void main(String[] args) {
        IPassportForThird adapter = new PassportForThirdAdapter();
        adapter.loginForQQ("asasasasasasa");
    }
}
