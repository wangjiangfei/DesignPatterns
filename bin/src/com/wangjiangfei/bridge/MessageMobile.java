package com.wangjiangfei.bridge;

/**
 * 以手机短消息的方式发送消息
 *
 * @author wangjiangfei
 */
public class MessageMobile implements MessageImplementor {

    @Override
    public void send(String message, String toUser) {
        System.out.println("使用手机短消息的方式，发送消息'"
                + message + "'给" + toUser);
    }
}
