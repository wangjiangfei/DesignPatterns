package com.wangjiangfei.strategy;

/**
 * 价格管理，主要完成计算向客户所报价格的功能
 *
 * @author wangjiangfei
 */
public class Price {

    /**
     * 持有一个具体的策略对象
     */
    private Strategy strategy = null;

    /**
     * 构造方法，传入一个具体的策略对象
     * @param strategy 具体的策略对象
     */
    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 报价，计算对客户的报价
     * @param goodsPrice 商品销售原价
     * @return 计算出来的，应该给客户报的价格
     */
    public double quote(double goodsPrice) {
        return this.strategy.calcPrice(goodsPrice);
    }
}
