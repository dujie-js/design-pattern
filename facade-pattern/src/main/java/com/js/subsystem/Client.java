package com.js.subsystem;

public class Client {
    /**
     * @Description: 通用写法
     * @Param [args]
     * @Author: 渡劫 dujie
     * @Date: 2021/4/29 1:28 PM
     * @return
     */
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.doA();
    }
}
