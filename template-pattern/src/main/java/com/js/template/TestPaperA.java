package com.js.template;

//甲乙两人只需要重写answer系列方法就可以实现结果的输出
public class TestPaperA extends TestPaper {

    @Override
    public String answer1() {
        return "c";
    }

    @Override
    public String answer2() {
        return "b";
    }

    @Override
    public String answer3() {
        return "a";
    }
}