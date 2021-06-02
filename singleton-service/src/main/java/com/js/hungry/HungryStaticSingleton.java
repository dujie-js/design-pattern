package com.js.hungry;

public class HungryStaticSingleton {
    /**
     * @Description: 单例模式饿汉式写法
     * @Param
     * @Author: 渡劫 dujie
     * @Date: 2021/4/28 11:49 AM
     * @return
     */
    private static final HungryStaticSingleton hungryStaticSingleton = new HungryStaticSingleton();

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return hungryStaticSingleton;
    }
}
