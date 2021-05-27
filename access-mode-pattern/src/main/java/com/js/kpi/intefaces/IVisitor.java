package com.js.kpi.intefaces;

import com.js.kpi.abstrat.impl.Engineer;
import com.js.kpi.abstrat.impl.Manager;

/**
 * @Description: 抽象访问者
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/5/27 11:25 AM
 * @return
 */
public interface IVisitor {

    void visit(Manager manager);

    void visit(Engineer engineer);
}
