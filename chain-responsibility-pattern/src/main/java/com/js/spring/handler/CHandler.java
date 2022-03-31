package com.js.spring.handler;

import com.js.spring.Handler;
import org.springframework.stereotype.Component;

/**
 * @description C处理器
 */
@Component("cHandler")
public class CHandler extends Handler {

    private final Integer order = 3;

    @Override
    public void doHandle(Integer num) {
        System.out.println("num!=10 && num！=100,C责任链处理");
    }

    @Override
    public Handler getNextHandler() {
        return null;
    }
}