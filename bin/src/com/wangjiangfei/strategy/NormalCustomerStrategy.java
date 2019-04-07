package com.wangjiangfei.strategy;

/**
 * 具体算法实现，为新客户或者普通客户计算应报的价格
 *
 * @author wangjiangfei
 */
public class NormalCustomerStrategy implements Strategy {

    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于新客户或者普通客户，没有折扣");
        return goodsPrice;
    }
}
