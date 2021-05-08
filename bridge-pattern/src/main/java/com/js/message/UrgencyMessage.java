package com.js.message;

import com.js.interfaces.IMessage;

/**
 * @Description: 紧急消息发送
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/5/8 3:47 PM
 * @return
 */
public class UrgencyMessage extends AbstractMessage {
    public UrgencyMessage(IMessage iMessage) {
        super(iMessage);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "紧急" + message;
        super.sendMessage(message, toUser);
    }

    public Object watch(String messageId){
        // 可以根据消息编码查询消息的处理状态
        return null;
    }
}
