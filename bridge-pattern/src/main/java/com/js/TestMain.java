package com.js;

import com.js.interfaces.IMessage;
import com.js.message.AbstractMessage;
import com.js.message.EmailMessage;
import com.js.message.NormalMessage;
import com.js.message.SmsMessage;
import com.js.message.UrgencyMessage;
/**
 * @Description: 桥接模式测试
 * @Param
 * @Author: 渡劫 dujie
 * @Date: 2021/5/8 3:53 PM
 * @return
 */
public class TestMain {
    public static void main(String[] args) {
        IMessage message = new SmsMessage();
        AbstractMessage smsMessage = new NormalMessage(message);
        smsMessage.sendMessage("12121","232323323");

        message = new EmailMessage();
        AbstractMessage urgencyMessage = new UrgencyMessage(message);
        urgencyMessage.sendMessage("紧急12121","紧急232323323");

    }
}
