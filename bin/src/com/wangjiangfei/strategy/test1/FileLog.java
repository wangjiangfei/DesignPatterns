package com.wangjiangfei.strategy.test1;

/**
 * 把日志记录到文件
 *
 * @author wangjiangfei
 */
public class FileLog implements LogStrategy {

    @Override
    public void log(String msg) {
        System.out.println("现在把 " + msg + " 记录到文件中");
    }
}
