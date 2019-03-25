package com.wangjiangfei.command.test2;

/**
 * 厨师对象，做凉菜
 *
 * @author wangjiangfei
 */
public class CoolCook implements CookApi {

    @Override
    public void cook(String name) {
        System.out.println("凉菜" + name + "已经最好，本厨师正在装盘");
    }
}
