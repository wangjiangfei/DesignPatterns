package com.wangjiangfei.command.test3;

public class Client {

    public static void main(String[] args) {
        // 准备要发出的命令，没有具体实现类了--------匿名内部类
        Command cmd = new Command() {

            private String str = "";

            @Override
            public void execute() {
                System.out.println("打印的内容为：" + str);
            }

            @Override
            public void setStr(String s) {
                this.str = s;
            }
        };
        cmd.setStr("退化的命令模式示例");


        Invoker invoker = new Invoker();
        // 按下按钮，真正启动执行命令
        invoker.startPrint(cmd);
    }
}
