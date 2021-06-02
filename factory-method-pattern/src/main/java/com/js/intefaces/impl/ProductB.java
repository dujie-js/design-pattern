package com.js.intefaces.impl;

import com.js.intefaces.IProduct;

public class ProductB implements IProduct {
    @Override
    public void doSomething() {
        System.out.println("这是产品B");
    }
}
