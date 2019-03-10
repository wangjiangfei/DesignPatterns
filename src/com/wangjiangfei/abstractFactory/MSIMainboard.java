package com.wangjiangfei.abstractFactory;

/**
 * 微星的主板
 *
 * @author wangjiangfei
 */
public class MSIMainboard implements MainboardApi {

    /**
     * CPU插槽的孔数
     */
    private int cpuHoles = 0;

    /**
     * 构造方法，传入CPU插槽的孔数
     * @param cpuHoles CPU插槽的孔数
     */
    public MSIMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("now in MSIMainboard, cpuHoles = " + cpuHoles);
    }
}
