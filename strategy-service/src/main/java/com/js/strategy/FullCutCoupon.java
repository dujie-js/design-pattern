package com.js.strategy;

import org.springframework.stereotype.Service;

@Service(value = "0")
public class FullCutCoupon implements CouponStrategy {

    @Override
    public boolean isSupport(Integer status) {
        return status.equals(0);
    }

    @Override
    public void discount() {
        System.out.println("test0");
    }
}