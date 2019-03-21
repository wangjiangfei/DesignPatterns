package com.wangjiangfei.factoryMethod;


/**
 * 导出成数据库备份文件的形式的对象
 *
 * @author wangjiangfei
 */
public class ExportDB implements ExportFileApi {

    @Override
    public boolean export(String data) {
        // 操作数据库
        System.out.println("导出数据" + data + "到数据库备份文件");
        return true;
    }
}
