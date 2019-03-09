package com.wangjiangfei.factoryMethod;

public class Client {

    public static void main(String[] args) {
        ExportOperate operate = new ExportDBOperate();
        // 调用输出数据的功能方法
        operate.export("测试数据");
    }
}
