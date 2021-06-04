package com.js.common.abstracts.impl;

import com.js.common.abstracts.Component;

//具体组件
public class ConcreteComponent extends Component {

    @Override
    public void operation() {
        System.out.println("处理具体组件的逻辑");
    }
}
