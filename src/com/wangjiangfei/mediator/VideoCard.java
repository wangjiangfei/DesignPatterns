package com.wangjiangfei.mediator;

/**
 * 显卡类，一个同事类
 *
 * @author wangjiangfei
 */
public class VideoCard extends Colleague {

    public VideoCard(Mediator mediator) {
        super(mediator);
    }


    public void showData(String data) {
        System.out.println("您正观看的是：" + data);
    }
}
