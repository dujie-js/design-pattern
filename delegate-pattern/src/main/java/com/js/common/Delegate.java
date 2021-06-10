package com.js.common;

import com.js.common.intefaces.Task;
import com.js.common.intefaces.impl.ConcreteA;
import com.js.common.intefaces.impl.ConcreteB;

import java.util.Random;

/**
 * @Description: 委派者角色
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/6/8 9:45 AM
 * @return
 */
public class Delegate implements Task {
    @Override
    public void doTask() {
        System.out.println("代理执行开始");

        Task task = null;

        if (new Random().nextBoolean()) {
            task = new ConcreteA();
            task.doTask();
        } else {
            task = new ConcreteB();
            task.doTask();
        }
        System.out.println("代理执行完毕");
    }
}
