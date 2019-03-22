package com.wangjiangfei.observer.test2;

import java.util.Observable;

/**
 * 真正的读者
 */
public class Reader implements java.util.Observer {

    /**
     * 读者的姓名
     */
    private String name;

    @Override
    public void update(Observable o, Object arg) {
        // 这是采用推的方式
        System.out.println(name + "收到报纸了，阅读它。目标推过来的内容是="
                + arg);
        // 这是采用拉的方式
//        System.out.println(name + "收到报纸了，阅读它。主动到目标对象去拉的内容是="
//                + ((NewsPaper)arg).getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
