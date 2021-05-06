package com.js.normal;

import com.js.intefaces.OrganizationComponent;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponentList = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    public void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    /**
     * 输出University包含的所有叶子
     */
    @Override
    public void print() {
        System.out.println("***********"+getName()+"****************");
        for (OrganizationComponent organizationComponent:organizationComponentList) {
            organizationComponent.print();
        }
    }
}
