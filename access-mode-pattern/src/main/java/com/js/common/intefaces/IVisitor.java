package com.js.common.intefaces;

import com.js.common.intefaces.impl.ConcreteElementA;
import com.js.common.intefaces.impl.ConcreteElementB;

/**
 * @Description: 抽象访问者
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/5/27 11:25 AM
 * @return
 */
public interface IVisitor {

    void visit(ConcreteElementA concreteElementA);

    void visit(ConcreteElementB concreteElementB);
}
