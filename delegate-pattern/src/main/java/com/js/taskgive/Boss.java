package com.js.taskgive;

import com.js.taskgive.intefaces.impl.Leader;

/**
 * @Description: 老板角度
 * @Author: 渡劫 dujie
 * @Date: 2021/6/8 10:02 AM
 * @return
 */
public class Boss {
    public void command(String task, Leader leader) {
        leader.doing(task);
    }
}
