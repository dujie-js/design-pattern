package com.js.two;


import com.js.two.interfaces.MementoInteface;
import com.js.two.pojo.Caretaker;
import com.js.two.pojo.Orginator;

public class Client {

    /**
     * @return
     * @Description: 对备忘录信息进行内部类进行实现保存保证备忘录对象对管理人员不会有可以操作的情况
     * @Param [args]
     * @Author: 渡劫 dujie
     * @Date: 2021/6/2 11:50 AM
     */
    public static void main(String[] args) {

        // 创建一个发起人
        Orginator orginator = new Orginator();

        // 创建一个备忘录对象
        Caretaker caretaker = new Caretaker();

        MementoInteface mementoInteface = orginator.createMemento();
        // 保存备忘录
        caretaker.storeMemento(mementoInteface);

        // 管理员存储发起人的备忘录
        orginator.restoreMemento(mementoInteface);

    }
}
