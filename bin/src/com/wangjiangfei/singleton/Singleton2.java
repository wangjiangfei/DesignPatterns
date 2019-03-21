package com.wangjiangfei.singleton;

/**
 * 单例模式(饿汉式)
 *
 * @author wangjiangfei
 */
public class Singleton2 {

    /**
     * 定义一个变量来存储创建好的实例
     * 因为这个变量要在静态方法中使用，所以需要加上static修饰
     * 注意在这里就创建类实例了
     */
    private static Singleton2 instance = new Singleton2();

    /**
     * 私有化构造方法
     */
    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        return instance;
    }

}
