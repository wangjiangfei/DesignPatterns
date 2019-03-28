package com.wangjiangfei.iterator.test1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 用来实现翻页访问聚合元素的迭代接口
 *
 * @author wangjiangfei
 */
public class ArrayIteratorImpl implements AggregationIterator {

    /**
     * 用来存放被迭代的数组
     */
    private PayModel[] pms = null;

    /**
     * 用来记录当前迭代到的位置索引
     */
    private int index = 0;

    public ArrayIteratorImpl(SalaryManager aggregate) {
        this.pms = aggregate.getPays();
    }

    @Override
    public boolean hasNext() {
        // 判断是否还有下一个元素
        if (pms != null && index <= (pms.length - 1)) {
            return true;
        }
        return false;
    }

    @Override
    public Collection next(int num) {
        Collection col = new ArrayList();
        int count = 0;
        while (hasNext() && count < num) {
            col.add(pms[index]);
            // 每取走一个值，就把已访问索引加1
            index++;
            count++;
        }
        return col;
    }

}
