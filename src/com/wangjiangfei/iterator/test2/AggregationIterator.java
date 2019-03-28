package com.wangjiangfei.iterator.test2;

import java.util.Collection;

/**
 * 定义随机翻页访问聚合元素的迭代接口
 *
 * @author wangjiangfei
 */
public interface AggregationIterator {

    /**
     * 判断是否还有下一个元素，无所谓是否够一页的数据
     * 因为最后哪怕只有一条数据，也是要算一页的
     * @return 如果有下一个元素，返回true，没有下一个元素就返回false
     */
    boolean hasNext();

    /**
     * 取出指定页数的数据
     * @param pageNum 要获取的页数
     * @param pageShow 每页显示的数据条数
     * @return 指定页数的数据
     */
    Collection getPage(int pageNum, int pageShow);

}
