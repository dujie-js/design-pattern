package com.js.message;

import com.js.interfaces.IMessage;

public abstract class AbstractMessage {
    IMessage iMessage;

    public AbstractMessage(IMessage iMessage) {
        this.iMessage = iMessage;
    }

    // 发送消息
    public void sendMessage(String message,String toUser){
        this.iMessage.send(message,toUser);
    }
}