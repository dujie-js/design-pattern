package com.js.project.service;

import com.js.project.domain.GiftInfo;

public class ShippingService {

    public String delivery(GiftInfo giftInfo){
        //物流系统对接逻辑
        System.out.println("商品已经进入物流系统" + giftInfo);
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
