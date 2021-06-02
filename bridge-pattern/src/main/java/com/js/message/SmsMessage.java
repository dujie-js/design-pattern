package com.js.message;

import com.js.two.interfaces.IMessage;

/**
 * @Description: 短信消息发送逻辑
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/5/8 3:39 PM
 * @return
 */
public class SmsMessage implements IMessage {
    @Override
    public void send(String message, String toUser) {
        System.out.println("发送短信的消息内容为" + message + "消息接受不了者为" + toUser);
    }
}
