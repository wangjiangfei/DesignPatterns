package com.wangjiangfei.singleton;

/**
 * 单例模式(懒汉式)
 *
 * @author wangjiangfei
 */
public class Singleton1 {

    /**
     * 定义一个变量来存储创建好的实例
     * 因为这个变量要在静态方法中使用，所以需要加上static修饰
     * 对保存实例的变量添加volatile的修饰
     */
    private volatile static Singleton1 instance = null;

    /**
     * 私有化构造方法
     */
    private Singleton1() {

    }

    /**
     * 只在第一次创建实例的时候同步，以后就不需要同步了，从而加快了运行速度
     * @return
     */
    public static Singleton1 getInstance() {
        // 先检查实例是否存在，如果不存在才进入下面的代码块
        if (instance == null) {
            // 同步块，线程安全地创建实例
            synchronized (Singleton1.class) {
                // 再次检查实例是否存在，如果不存在才真正地创建实例
                if (instance == null) {
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }

}
