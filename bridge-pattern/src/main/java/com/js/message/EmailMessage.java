package com.js.message;

import com.js.interfaces.IMessage;
/**
 * @Description: 创建邮件
 *               邮件消息实现类
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/5/8 3:36 PM
 */
public class EmailMessage implements IMessage {
    @Override
    public void send(String message, String toUser) {
        System.out.println("发送邮件的消息内容为" + message + "消息接受不了者为" + toUser);
    }
}
