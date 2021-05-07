package com.js.normal.interfaces;

import com.js.vo.ResultMsg;

public interface IPassportForThird {
    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelPhone(String phone,String code);
}
