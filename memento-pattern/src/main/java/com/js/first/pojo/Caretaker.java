package com.js.first.pojo;


/**
 * @Description: 备忘对象
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/6/1 4:09 PM
 * @return
 */

public class Caretaker {

    /**
     * 备忘录对象
     **/
    private Memento memento;

    public Memento getMemento() {
        return this.memento;
    }


    public void storeMemento(Memento memento) {
        this.memento = memento;
    }


}
