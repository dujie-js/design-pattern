package com.js.intefaceadapt.abstracts;

import com.js.intefaceadapt.intefaces.ILoginAdapter;
import com.js.normal.interfaces.IPassportForThird;
import com.js.vo.ResultMsg;

public class PassportForThirdAdapter implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String openId) {
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelPhone(String phone, String code) {
        return null;
    }

    public ResultMsg processLogin(String id, Class<? extends ILoginAdapter> clazz) {
        try{
            ILoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)){
                return adapter.login(id,adapter);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
