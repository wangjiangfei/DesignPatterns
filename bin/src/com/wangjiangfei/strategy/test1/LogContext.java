package com.wangjiangfei.strategy.test1;

/**
 * 日志记录的上下文
 *
 * @author wangjiangfei
 */
public class LogContext {

    /**
     * 记录日志的方法，提供给客户端使用
     * @param msg
     */
    public void log(String msg) {
        LogStrategy strategy = new DbLog();
        // 优先选择策略：记录到数据库
        try {
            strategy.log(msg);
        } catch (Exception e) {
            // 出错了，那就记录到文件中
            strategy = new FileLog();
            strategy.log(msg);
        }
    }
}
