package com.js.tradadtion;

import com.js.tradadtion.pojo.TestPaperA;

//主函数测试类
public class Test {

    /**
     * @return
     * @Description: 此时实现方法出现大量的冗余
     * @Param [args]
     * @Author: 渡劫 dujie
     * @Date: 2021/5/21 11:44 AM
     */
    public static void main(String[] args) {
        System.out.println("甲抄的文档");
        TestPaperA testPaperA = new TestPaperA();
        testPaperA.TestQuestion1();
        testPaperA.TestQuestion2();
        testPaperA.TestQuestion3();
    }
}