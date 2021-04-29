package com.js.project.facade;

import com.js.project.domain.GiftInfo;
import com.js.project.service.PaymentService;
import com.js.project.service.QualifyService;
import com.js.project.service.ShippingService;


/**
 * @Description: 门面模式主要作用是给前端释放统一接口，后台将零散逻辑进行整合
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/4/29 3:14 PM
 * @return
 */
public class GiftFacadeService {
    private PaymentService paymentService = new PaymentService();

    private QualifyService qualifyService = new QualifyService();

    private ShippingService shippingService = new ShippingService();
    // 兑换
    public void exchange(GiftInfo giftInfo){
        if (qualifyService.isAvailable(giftInfo)){
            if (paymentService.pay(giftInfo)){
                String shippingOrderNo = shippingService.delivery(giftInfo);
                System.out.println("物流成功订单号为" + shippingOrderNo);
            }
        }
    }
}
