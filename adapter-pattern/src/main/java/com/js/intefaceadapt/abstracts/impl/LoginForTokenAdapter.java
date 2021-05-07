package com.js.intefaceadapt.abstracts.impl;

import com.js.intefaceadapt.abstracts.AbstractAdapter;
import com.js.vo.ResultMsg;

public class LoginForTokenAdapter extends AbstractAdapter {
    @Override
    public boolean support(Object object) {
        return object instanceof LoginForTokenAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if (!support(adapter)) {
            return null;
        }
        return super.loginForRegist(id,null);
    }
}
