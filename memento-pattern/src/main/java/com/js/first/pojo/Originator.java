package com.js.first.pojo;

/**
 * @Description: 发起人角色
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/6/1 5:30 PM
 * @return
 */
public class Originator {
    /**
     * 内部状态
     **/
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 创建一个备忘录
     **/
    public Memento createMemento() {
        return new Memento(this.state);
    }

    /**
     * 从备忘录恢复
     **/
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }
}
