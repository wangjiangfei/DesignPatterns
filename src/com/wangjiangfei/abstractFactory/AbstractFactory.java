package com.wangjiangfei.abstractFactory;

/**
 * 抽象工厂的接口
 *
 * @author wangjiangfei
 */
public interface AbstractFactory {

    /**
     * 创建CPU的对象
     * @return CPU的对象
     */
    CPUApi createCPUApi();

    /**
     * 创建主板的方法
     * @return 主板的对象
     */
    MainboardApi createMainboardApi();
}
