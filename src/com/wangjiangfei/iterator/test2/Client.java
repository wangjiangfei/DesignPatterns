package com.wangjiangfei.iterator.test2;

import java.util.Collection;
import java.util.Iterator;

public class Client {

    public static void main(String[] args) {
        // 访问新收购公司的工资列表，先计算再获取
        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();

        // 得到翻页迭代器
        AggregationIterator it = salaryManager.createIterator();

        // 获取第一页，每页显示2条
        Collection col = it.getPage(1, 2);
        System.out.println("第一页数据：");
        printInfo(col);

        // 获取第二页，每页显示2条
        Collection col2 = it.getPage(2, 2);
        System.out.println("第二页数据：");
        printInfo(col2);

        // 获取第三页
        Collection col3 = it.getPage(3, 2);
        System.out.println("第三页数据：");
        printInfo(col3);
    }

    /**
     * 输出集合中的值
     * @param col 集合
     */
    private static void printInfo(Collection col) {
        Iterator it = col.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
