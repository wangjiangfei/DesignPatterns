package com.wangjiangfei.iterator;

public class Client {

    public static void main(String[] args) {
        // 1、访问集团的工资列表
        PayManager payManager = new PayManager();
        // 先计算再获取
        payManager.calcPay();
        System.out.println("集团工资列表：");
        showInfo(payManager.createIterator());

        // 2、访问新收购公司的工资列表
        SalaryManager salaryManager = new SalaryManager();
        // 先计算再获取
        salaryManager.calcSalary();
        System.out.println("新收购公司的工资列表：");
        showInfo(salaryManager.createIterator());
    }

    /**
     * 通过访问聚合对象的迭代器，访问聚合对象
     * @param it 聚合对象的迭代器
     */
    private static void showInfo(Iterator it) {
        // 循环输出聚合对象中的值
        // 首先设置迭代器到第一个元素
        it.first();
        while (!it.isDone()) {
            // 取出当前元素来
            Object obj = it.currentItem();
            System.out.println("this obj == " + obj);
            it.next();
        }
    }
}
