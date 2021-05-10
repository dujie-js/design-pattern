package com.js.leader;

import com.js.intefaces.ITarget;
import com.js.mytarget.TargetA;
import com.js.mytarget.TargetB;

import java.util.HashMap;
import java.util.Map;

public class TeamLeader {

    private Map<String, ITarget> targets = new HashMap<>();

    /**
     * 项目经理持有小组成员名单科通选择，类似于策略模式
     */
    public TeamLeader() {
        targets.put("加密", new TargetA());
        targets.put("解密", new TargetB());
    }

    /**
     * “调度方法”
     */
    public void dispather(String commond) {
        targets.get(commond).doSomeThing(commond);
    }
}