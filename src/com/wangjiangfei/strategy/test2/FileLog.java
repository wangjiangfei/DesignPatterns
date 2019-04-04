package com.wangjiangfei.strategy.test2;


/**
 * 把日志记录到文件
 *
 * @author wangjiangfei
 */
public class FileLog extends LogStategyTemplate {

    public void doLog(String msg) {
        System.out.println("现在把 " + msg + " 记录到文件中");
    }
}
