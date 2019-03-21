package com.wangjiangfei.abstractFactory;

/**
 * 装机方案2：AMD的CPU，微星的主板
 * 这里创建CPU和主板对象的时候，是对应的，能匹配上的
 *
 * @author wangjiangfei
 */
public class Schema2 implements AbstractFactory {

    @Override
    public CPUApi createCPUApi() {
        return new AMDCPU(939);
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new MSIMainboard(939);
    }
}
