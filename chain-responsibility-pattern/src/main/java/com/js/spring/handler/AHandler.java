package com.js.spring.handler;

import com.js.spring.Handler;
import org.springframework.stereotype.Component;

/**
 * @description A处理器
 */
@Component("aHandler")
public class AHandler extends Handler {

    private final Integer order = 1;

    @Override
    public Handler getNextHandler() {
        return nextHandler;
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public final Integer myNum = 10;

    @Override
    public void doHandle(Integer num) {
        if (myNum.equals(num)) {
            System.out.println("num==10,A责任链处理");
        } else {
            //交给下一个处理器处理
            nextHandler.doHandle(num);
        }
    }
}
