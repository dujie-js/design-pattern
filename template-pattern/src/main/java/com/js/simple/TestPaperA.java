package com.js.simple;

//甲抄的文件
public class TestPaperA extends TestPaper {

    @Override
    public void TestQuestion1() {
        super.TestQuestion1();
        System.out.println("a");
    }

    @Override
    public void TestQuestion2() {
        super.TestQuestion2();
        System.out.println("b");
    }

    @Override
    public void TestQuestion3() {
        super.TestQuestion3();
        System.out.println("c");
    }

}