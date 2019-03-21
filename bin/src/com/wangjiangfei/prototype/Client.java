package com.wangjiangfei.prototype;

public class Client {

    public static void main(String[] args) {
        // 先创建原型实例
        PersonalOrder oa1 = new PersonalOrder();
        oa1.setOrderProductNum(100);
        System.out.println(oa1.getOrderProductNum());

        PersonalOrder oa2 = (PersonalOrder) oa1.clone();
        oa2.setOrderProductNum(80);
        System.out.println(oa2.getOrderProductNum());

        System.out.println(oa1.getOrderProductNum());
    }
}
