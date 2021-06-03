package com.js.common.intefaces.impl;

import com.js.common.intefaces.IPrototype;

public class ConcretePrototypeB implements IPrototype<ConcretePrototypeB> {

    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ConcretePrototypeB(String desc) {
        this.desc = desc;
    }

    @Override
    public ConcretePrototypeB clone() {
        return new ConcretePrototypeB(this.desc);
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
