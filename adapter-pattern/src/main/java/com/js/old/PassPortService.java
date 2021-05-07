package com.js.old;

import com.js.vo.ResultMsg;

/**
 * @Description: 假设本方法为项目重构之前的方法
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/5/7 2:08 PM
 * @return
 */
public class PassPortService {

    /**
     * @return
     * @Description: 历史注册方法
     * @Param [userName, password]
     * @Author: 渡劫 dujie
     * @Date: 2021/5/7 2:11 PM
     */
    public ResultMsg regist(String userName, String password) {
        return new ResultMsg(200, "成功", null);
    }

    /**
     * @return
     * @Description: 历史的登陆方法
     * @Param [userName, password]
     * @Author: 渡劫 dujie
     * @Date: 2021/5/7 2:12 PM
     */
    public ResultMsg login(String userName, String password) {
        return new ResultMsg(200, "登陆成功", null);
    }
}
