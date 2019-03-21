package com.wangjiangfei.mediator;

public class SoundCard extends Colleague {

    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 按照声频发出声音
     * @param data 发出声音的数据
     */
    public void soundData(String data) {
        System.out.println("画外音：" + data);
    }
}
