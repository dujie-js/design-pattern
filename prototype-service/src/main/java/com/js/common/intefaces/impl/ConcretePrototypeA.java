package com.js.common.intefaces.impl;

import com.js.common.intefaces.IPrototype;

public class ConcretePrototypeA implements IPrototype<ConcretePrototypeA> {

    private String desc;

    public ConcretePrototypeA(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public ConcretePrototypeA clone() {
        return new ConcretePrototypeA(this.desc);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"desc\":\"")
                .append(desc).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
