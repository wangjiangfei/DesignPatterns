package com.wangjiangfei.decorator;

import java.util.HashMap;
import java.util.Map;

/**
 * 在内存中模拟数据库，准备点测试数据，好计算奖金
 *
 * @author wangjiangfei
 */
public class TempDB {

    private TempDB() {
    }

    /**
     * 记录每个人的月度销售额，只用了人员，月份没有用
     */
    public static Map<String, Double> mapMonthSaleMoney =
            new HashMap<>();

    static {
        mapMonthSaleMoney.put("张三", 10000.0);
        mapMonthSaleMoney.put("李四", 20000.0);
        mapMonthSaleMoney.put("王五", 30000.0);
    }
}
