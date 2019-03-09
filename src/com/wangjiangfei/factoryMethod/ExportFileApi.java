package com.wangjiangfei.factoryMethod;


/**
 * 导出的文件对象的接口
 *
 * @author wangjiangfei
 */
public interface ExportFileApi {

    /**
     * 导出内容成为文件
     * @param data 需要导出的内容
     * @return 是否导出成功
     */
    boolean export(String data);
}
