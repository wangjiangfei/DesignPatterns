package com.wangjiangfei.strategy;

/**
 * 具体算法实现，为老客户计算应报的价格
 *
 * @author wangjiangfei
 */
public class OldCustomerStratgy implements Strategy {

    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于老客户，统一折扣5%");
        return goodsPrice * (1 - 0.05);
    }
}
