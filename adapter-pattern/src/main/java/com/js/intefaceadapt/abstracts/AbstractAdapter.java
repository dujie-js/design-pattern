package com.js.intefaceadapt.abstracts;

import com.js.intefaceadapt.intefaces.ILoginAdapter;
import com.js.old.PassPortService;
import com.js.vo.ResultMsg;

public abstract class AbstractAdapter extends PassPortService implements ILoginAdapter {
    @Override
    public abstract boolean support(Object object);

    @Override
    public abstract ResultMsg login(String id, Object adapter);

    public ResultMsg loginForRegist(String userName, String password) {
        if (null == password) {
            password = "THIRD_EMPTY";
        }
        super.regist(userName, password);
        return super.login(userName, password);
    }
}
