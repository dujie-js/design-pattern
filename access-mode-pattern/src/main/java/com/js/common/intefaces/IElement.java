package com.js.common.intefaces;

/**
 * @Description: 抽象方法
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/5/27 11:24 AM
 * @return
 */
public interface IElement {
    void accept(IVisitor visitor);
}
