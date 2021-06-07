package com.js.message;

import com.js.two.interfaces.MessageInteface;

/**
 * @Description: 普通消息发送
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/5/8 3:46 PM
 * @return
 */
public class NormalMessage extends AbstractMessage {
    public NormalMessage(MessageInteface iMessage) {
        super(iMessage);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        // 普通消息直接调用父类方法发送消息
        super.sendMessage(message, toUser);
    }
}
