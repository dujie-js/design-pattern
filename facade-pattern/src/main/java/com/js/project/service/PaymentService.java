package com.js.project.service;

import com.js.project.domain.GiftInfo;

public class PaymentService {

    public boolean pay(GiftInfo giftInfo) {
        System.out.println("支付成功" + giftInfo);
        return true;
    }
}
