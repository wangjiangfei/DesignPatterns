package com.wangjiangfei.strategy.test2;

/**
 * 日志记录策略的接口
 *
 * @author wangjiangfei
 */
public interface LogStrategy {

    /**
     * 记录日志
     * @param msg 需记录的日志信息
     */
    void log(String msg);
}
