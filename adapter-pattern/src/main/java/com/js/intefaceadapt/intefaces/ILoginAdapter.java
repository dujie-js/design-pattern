package com.js.intefaceadapt.intefaces;

import com.js.vo.ResultMsg;

public interface ILoginAdapter {
    boolean support(Object object);

    ResultMsg login(String id, Object adapter);
}
