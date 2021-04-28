package com.js.strategy;

import org.springframework.stereotype.Service;

@Service(value = "1")
public class DiscountCoupon implements CouponStrategy {

    @Override
    public boolean isSupport(Integer status) {
        return status.equals(1);
    }

    @Override
    public void discount() {
        System.out.println("test1");
    }
}
