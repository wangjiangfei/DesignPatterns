package com.wangjiangfei.command.test3;

public interface Command {

    void execute();

    /**
     * 设置要输出的内容
     * @param s 输出的内容
     */
    void setStr(String s);
}
