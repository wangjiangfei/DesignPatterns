package com.wangjiangfei.factoryMethod;

/**
 * 导出成文件文本格式的对象
 *
 * @author wangjiangfei
 */
public class ExportTxtFile implements ExportFileApi {

    @Override
    public boolean export(String data) {
        // 操作文件
        System.out.println("导出数据" + data + "到文本文件");
        return true;
    }
}
