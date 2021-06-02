package com.js.first;

import com.js.first.pojo.Caretaker;
import com.js.first.pojo.Originator;

public class Client {
    /**
     * 备忘录模式要求备忘录的内容只对发起人可见，对其他对象不可见
     * 但是本种方法备忘录管理员实际上可以通过备忘录提供的相关方法获取和修改内部状态
     * 这样就违背了备忘录模式的要求，可能造成备忘录内部状态被其他对象修改，导致发起人状态恢复错误，系统稳定性下降
     */
    public static void main(String[] args) {

        // 创建一个发起人
        Originator originator = new Originator();

        // 创建一个备忘录管理员
        Caretaker caretaker = new Caretaker();
        // 管理员存储发起人的备忘录
        caretaker.storeMemento(originator.createMemento());
        // 发起人从管理员获取备忘录进行回滚
        originator.restoreMemento(caretaker.getMemento());

    }
}
