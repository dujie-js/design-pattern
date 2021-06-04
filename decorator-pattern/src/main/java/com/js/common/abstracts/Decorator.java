package com.js.common.abstracts;

/**
 * @Description: 持有组件的对象抽象类
 * @Author: 渡劫 dujie
 * @return
 */
public abstract class Decorator extends Component {
    /**
     * 组件对象
     **/
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
        System.out.println("持有组建的对象的附加操作");
    }
}
