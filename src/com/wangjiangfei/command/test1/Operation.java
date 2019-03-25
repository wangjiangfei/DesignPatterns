package com.wangjiangfei.command.test1;

/**
 * 运算类，真正实现加减法运算
 *
 * @author wangjiangfei
 */
public class Operation implements OperationApi {

    /**
     * 记录运算的结果
     */
    private int result;

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public void add(int num) {
        // 实现加法功能
        result += num;
    }

    @Override
    public void substract(int num) {
        // 实现减法功能
        result -= num;
    }
}
