package com.wangjiangfei.observer.test1;

public class Reader implements Observer {

    /**
     * 读者的姓名
     */
    private String name;

    @Override
    public void update(String content) {
        // 这是采用推的方式
        System.out.println(name + "收到报纸了，阅读它。内容是="
                + content);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
