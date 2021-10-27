package com.js.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private CouponContext couponContext;

    public void test(Integer status) {
        couponContext.selectStrategy(status);
    }
    public void testList(Integer status) {
        couponContext.findStrategy(status);
    }
}
