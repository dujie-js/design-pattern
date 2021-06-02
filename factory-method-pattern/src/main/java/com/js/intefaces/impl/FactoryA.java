package com.js.intefaces.impl;

import com.js.intefaces.IFactory;
import com.js.intefaces.IProduct;

public class FactoryA implements IFactory {

    @Override
    public IProduct makeProduct() {
        return new ProductA();
    }
}
