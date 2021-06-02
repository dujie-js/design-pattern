package com.js.intefaces;

/**
 * @Description: 组合模式，常用在树形结构的处理 例如：文件夹目录结构
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/5/6 2:00 PM
 * @return
 */
public abstract class OrganizationComponent {
    private String name;
    private String des;

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    public abstract void print();
}

