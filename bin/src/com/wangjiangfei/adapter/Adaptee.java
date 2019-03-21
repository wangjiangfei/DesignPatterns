package com.wangjiangfei.adapter;

/**
 * 已经存在的接口，这个接口需要被适配
 *
 * @author wangjiangfei
 */
public class Adaptee {

    /**
     * 原本已经存在，已经实现的方法
     */
    public void specificRequest() {
        // 具体的功能处理
        System.out.println("具体的功能处理");
    }

}
