package com.js.message;

import com.js.two.interfaces.MessageInteface;

public abstract class AbstractMessage {
    MessageInteface iMessage;

    protected AbstractMessage(MessageInteface iMessage) {
        this.iMessage = iMessage;
    }

    // 发送消息
    public void sendMessage(String message, String toUser) {
        this.iMessage.send(message, toUser);
    }
}
