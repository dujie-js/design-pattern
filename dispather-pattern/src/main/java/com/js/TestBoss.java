package com.js;

import com.js.leader.Boss;
import com.js.leader.TeamLeader;

public class TestBoss {
    /**
     * 在一些框架源码中，比如Spring等，命名一Delegate结尾比如BeanDefinitionParserDelegate(根据不同的类型委派不同的
     * 逻辑解析BeanDefinition),或者是以Dispacher开头和结尾或开头的比如DispacherServlet一般都使用了委派模式
     */
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.commod("加密", new TeamLeader());
    }
}
