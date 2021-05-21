package com.js.simple;

//乙抄的文件
public class TestPaperB extends TestPaper {

    @Override
    public void TestQuestion1() {
        super.TestQuestion1();
        System.out.println("b");
    }

    @Override
    public void TestQuestion2() {
        super.TestQuestion2();
        System.out.println("c");
    }

    @Override
    public void TestQuestion3() {
        super.TestQuestion3();
        System.out.println("a");
    }

}
