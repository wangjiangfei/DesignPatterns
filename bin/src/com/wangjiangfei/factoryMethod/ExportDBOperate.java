package com.wangjiangfei.factoryMethod;


/**
 * 具体的创建器实现对象，实现创建导出成数据库备份文件形式的对象
 *
 * @author wangjiangfei
 */
public class ExportDBOperate extends ExportOperate {

    @Override
    protected ExportFileApi factoryMethod() {
        // 创建导出成数据库备份文件形式的对象
        return new ExportDB();
    }
}
