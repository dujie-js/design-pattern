package com.js.inerclass;

public class Client {
    /**
     * @Description: 方法一为内部类的写法
     * @Param [args]
     * @Author: 渡劫 dujie
     * @Date: 2021/4/28 11:46 AM
     */
    public static void main(String[] args) {
        Singleton.getInstance();
    }

    static class Singleton {
        private static final Singleton instance = new Singleton();

        private Singleton() {
        }

        public static Singleton getInstance() {
            return instance;
        }
    }
}
