package com.js.two.pojo;

import com.js.two.interfaces.MementoInteface;

/**
 * @Description: 备忘录对象
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/6/2 10:56 AM
 * @return
 */
public class Caretaker {
    private MementoInteface memento;

    public Caretaker() {

    }

    public MementoInteface getMemento() {
        return this.memento;
    }

    public void storeMemento(MementoInteface memento) {
        this.memento = memento;
    }
}
