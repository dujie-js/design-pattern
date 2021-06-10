package com.js.taskgive.intefaces.impl;

import com.js.taskgive.intefaces.IEmployee;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 项目经理类
 * @Author: 渡劫 dujie
 * @Date: 2021/6/8 9:53 AM
 * @return
 */
public class Leader implements IEmployee {

    private Map<String, IEmployee> employee = new HashMap<>();

    public Leader() {
        employee.put("爬虫", new EmployeeA());
        employee.put("海报图", new EmployeeB());
    }

    @Override
    public void doing(String task) {
        if (!employee.containsKey(task)) {
            System.out.println("超出我的能力范畴");
            return;
        }
        employee.get(task).doing(task);
    }
}
