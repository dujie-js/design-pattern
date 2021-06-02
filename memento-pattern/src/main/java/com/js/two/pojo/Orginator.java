package com.js.two.pojo;

import com.js.two.interfaces.MementoInteface;

/**
 * 发起人角色
 **/
public class Orginator {
    // 内部状态
    private String state;

    public Orginator() {
    }

    /**
     * 创建一个备忘录
     **/
    public Memento createMemento() {
        return new Memento(this.state);
    }

    // 从备忘录恢复
    public void restoreMemento(MementoInteface memento) {
        this.state = ((Memento) memento).state;
    }


    private static class Memento implements MementoInteface {

        private String state;

        private Memento(String state) {
            this.state = state;
        }

    }
}
