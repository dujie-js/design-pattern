package com.js.spring.intefaces;

public interface Strategy<S,R> {
    /**
     * @Description: 是否由自己执行
     * @Param [request]
     * @Date: 2022/8/30 21:09
     * @return
     */
    Boolean isMyDuty(R request);

    /**
     * @Description: 执行的具体方法
     * @Param [request]
     * @Date: 2022/8/30 21:10
     * @return
     */
    S doApply(R request);


}
