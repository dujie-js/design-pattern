package com.js.spring.handler;

import com.js.spring.Handler;
import org.springframework.stereotype.Component;

/**
 * @author: Gabriel
 * @date: 2020/3/15 23:41
 * @description B处理器
 */
@Component("bHandler")
public class BHandler extends Handler {


    private final Integer order = 2;

    @Override
    public Handler getNextHandler() {
        return nextHandler;
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final Integer myNum = 100;

    @Override
    public void doHandle(Integer num) {
        if (myNum.equals(num)) {
            System.out.println("num==100,B责任链处理");
        } else {
            nextHandler.doHandle(num);
        }
    }
}