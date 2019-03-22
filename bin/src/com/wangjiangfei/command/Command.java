package com.wangjiangfei.command;

/**
 * 命令接口，声明执行的操作
 *
 * @author wangjiangfei
 */
public interface Command {

    /**
     * 执行命令对应的操作
     */
    void execute();
}
