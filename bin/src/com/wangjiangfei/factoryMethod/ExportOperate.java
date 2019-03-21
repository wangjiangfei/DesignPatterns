package com.wangjiangfei.factoryMethod;

/**
 * 实现导出数据的业务功能对象
 *
 * @author wangjiangfei
 */
public abstract class ExportOperate {

    /**
     * 导出文件
     * @param data 需要保存的数据
     * @return 是否成功导出文件
     */
    public boolean export(String data) {
        // 使用工厂方法
        ExportFileApi api = factoryMethod();
        return api.export(data);
    }

    /**
     * 工厂方法，一般不对外
     * 工厂方法，创建导出的文件对象
     * 一般工厂方法返回的是被创建的对象的接口对象
     * @return 导出的文件对象的接口对象
     */
    protected abstract ExportFileApi factoryMethod();
}
