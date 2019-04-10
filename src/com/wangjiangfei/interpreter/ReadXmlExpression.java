package com.wangjiangfei.interpreter;

/**
 * 用于处理自定义xml取值表达式的接口
 *
 * @author wangjiangfei
 */
public abstract class ReadXmlExpression {

    /**
     * 解释表达式
     * @param context 上下文
     * @return 解析后的值，可能是单个值或多个值，因此就返回一个数组
     */
    public abstract String[] interpreter(Context context);
}
