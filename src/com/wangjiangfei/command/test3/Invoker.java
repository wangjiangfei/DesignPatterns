package com.wangjiangfei.command.test3;

public class Invoker {

    /**
     * 开始打印
     */
    public void startPrint(Command cmd) {
        // 执行命令的功能
        cmd.execute();
    }
}
