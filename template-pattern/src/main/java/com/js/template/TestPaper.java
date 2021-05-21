package com.js.template;

/**
 * @Description: 将每个答案定义为一个函数子类继承重写该函数便可以实现一套模板多用
 * 模板模式的主要作用是把所有的相同代码抽离成为顶级方法
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/5/21 11:51 AM
 * @return
 */
public class TestPaper {
    public void TestQuestion1() {
        System.out.println("问题一: a,b,c,d");
        System.out.println("结果为" + answer1());
    }
    public void TestQuestion2() {
        System.out.println("问题二: a,b,c,d");
        System.out.println("结果为" + answer2());
    }
    public void TestQuestion3() {
        System.out.println("问题三: a,b,c,d");
        System.out.println("结果为" + answer3());
    }
    public String answer1() {
        return "";
    }
    public String answer2() {
        return "";
    }
    public String answer3() {
        return "";
    }
}

