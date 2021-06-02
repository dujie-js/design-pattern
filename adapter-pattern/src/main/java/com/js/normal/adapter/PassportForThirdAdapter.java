package com.js.normal.adapter;

import com.js.normal.interfaces.IPassportForThird;
import com.js.old.PassPortService;
import com.js.vo.ResultMsg;

/**
 * @Description: 创建适配器对象继承原来的规则
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/5/7 2:14 PM
 */
public class PassportForThirdAdapter extends PassPortService implements IPassportForThird {

    @Override
    public ResultMsg loginForQQ(String openId) {
        return loginForRegist(openId, null);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return loginForRegist(openId, null);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return loginForRegist(token, null);
    }

    @Override
    public ResultMsg loginForTelPhone(String phone, String code) {
        return loginForRegist(phone, null);
    }


    private ResultMsg loginForRegist(String userName, String password) {
        if (null == password) {
            password = "THIRD_EMPTY";
        }
        super.regist(userName, password);
        return super.login(userName, password);
    }
}
