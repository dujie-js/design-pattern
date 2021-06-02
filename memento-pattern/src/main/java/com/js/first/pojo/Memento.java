package com.js.first.pojo;

/**
 * @Description: 备忘录记录
 * @Author: 渡劫 dujie
 * @Date: 2021/6/1 4:08 PM
 * @return
 */
public class Memento {

    private String state;

    public Memento() {
    }

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
