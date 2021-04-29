package com.js.duotaiproxy;

import com.js.duotaiproxy.intefaces.IPerson;
import com.js.duotaiproxy.person.ZhangLaoSan;
import com.js.duotaiproxy.person.ZhangSan;
import com.js.duotaiproxy.person.ZhaoLiu;
import com.js.duotaiproxy.person.ZhongJie;

public class TestProxy {
    public static void main(String[] args) {
        // 弊端 ： 职能单一
        ZhangLaoSan zhangLaoSan = new ZhangLaoSan(new ZhangSan());
        zhangLaoSan.findLove();

        // 采用jdk的动态代理方式对象不受限制
        ZhongJie zhongJie = new ZhongJie();
        IPerson zhaoLiu = zhongJie.getInstance(new ZhaoLiu());
        zhaoLiu.findLove();
    }
}
