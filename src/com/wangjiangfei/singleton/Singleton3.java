package com.wangjiangfei.singleton;

/**
 * 单例模式(静态内部类、缺省同步锁)
 *
 * @author wangjiangfei
 */
public class Singleton3 {

    /**
     * 私有化构造方法
     */
    private Singleton3() {

    }

    /**
     * 当getInstance方法第一次被调用的时候，它第一次读取SingletonHolder.instance,
     * 导致SingletonHolder类得到初始化：而这个类在装载并被初始化的时候，会初始化它的静态域，
     * 从而创建Singleton的实例，由于是静态的域，因此只会在虚拟机装载类的时候初始化一次，
     * 并由虚拟机来保证它的线程安全性。
     *
     * @return
     */
    public static Singleton3 getInstance() {
        return SingletonHolder.instance;
    }

    /**
     * 类级的内部类，也就是静态成员式的内部类，该内部类的实例与外部类的实例
     * 没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
     */
    private static class SingletonHolder {
        /**
         * 由JVM来保证线程安全
         */
        private static Singleton3 instance = new Singleton3();
    }

}
