package com.wangjiangfei.abstractFactory;

/**
 * 装机方案1：Intel的CPU，技嘉的主板
 * 这里创建CPU和主板对象的时候，是对应的，能匹配上的
 *
 * @author wangjiangfei
 */
public class Schema1 implements AbstractFactory {

    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU(1156);
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new GAMainboard(1156);
    }
}
