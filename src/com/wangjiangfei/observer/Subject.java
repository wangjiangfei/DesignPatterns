package com.wangjiangfei.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，作为被观察者
 */
public class Subject {

    /**
     * 用来保存注册的观察者对象，也就是报纸的订阅者
     */
    private List<Observer> readers = new ArrayList<>();

    /**
     * 报纸的读者需要向报社订阅，先要注册
     * @param reader 报纸的读者
     */
    public void attach(Observer reader) {
        readers.add(reader);
    }

    /**
     * 报纸的读者可以取消订阅
     * @param observer
     */
    public void detach(Observer observer) {
        readers.remove(observer);
    }

    /**
     * 当每期报纸印刷出来后，就要迅速主动地被送到读者的手中
     */
    protected void notifyObservers() {
        for (Observer reader : readers) {
            reader.update(this);
        }
    }
}
