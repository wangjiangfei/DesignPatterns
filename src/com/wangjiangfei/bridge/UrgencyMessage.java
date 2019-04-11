package com.wangjiangfei.bridge;

/**
 * 加急消息
 *
 * @author wangjiangfei
 */
public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "加急：" + message;
        super.sendMessage(message, toUser);
    }
}
