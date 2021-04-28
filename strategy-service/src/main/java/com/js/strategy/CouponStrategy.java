package com.js.strategy;

public interface CouponStrategy {

    void discount();

    boolean isSupport(Integer status);

}