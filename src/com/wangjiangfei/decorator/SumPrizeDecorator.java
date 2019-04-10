package com.wangjiangfei.decorator;

import java.util.Date;

/**
 * 装饰器对象，计算累计奖金
 *
 * @author wangjiangfei
 */
public class SumPrizeDecorator extends Decorator {

    public SumPrizeDecorator(Component c) {
        super(c);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        // 1、先获取前面运算出来的奖金
        double money = super.calcPrize(user, begin, end);
        // 2、然后计算累计奖金，其实应按人员去获取累积的业务额，然后再乘以0.1%
        // 简单演示一下，假定大家的累计业务额都是1000000元
        double prize = 1000000 * 0.001;
        System.out.println(user + "累计奖金" + prize);
        return money + prize;
    }
}
