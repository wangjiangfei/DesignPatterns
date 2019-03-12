package com.wangjiangfei.prototype;

/**
 * 企业订单对象
 *
 * @author wangjiangfei
 */
public class EnterpriseOrder implements Cloneable, OrderApi {

    /**
     * 企业名称
     */
    private String enterpriseName;

    /**
     * 产品编号
     */
    private String productId;

    /**
     * 订单产品数量
     */
    private int orderProductNum = 0;

    @Override
    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "本企业订单的订购企业是=" + this.enterpriseName + ",订购产品是=" +
                this.productId + ",订购数量为=" + this.orderProductNum;
    }

    @Override
    protected Object clone() {
        // 克隆方法的真正实现，直接调用父类的克隆方法就可以了
        Object obj = null;
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
