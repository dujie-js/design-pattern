package com.js.project.service;

import com.js.project.domain.GiftInfo;

/**
 * @Description: 积分逻辑
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/4/29 1:49 PM
 * @return
 */
public class QualifyService {

    public boolean isAvailable(GiftInfo giftInfo) {
        System.out.println("校验积分通过" + giftInfo);
        return true;
    }
}
