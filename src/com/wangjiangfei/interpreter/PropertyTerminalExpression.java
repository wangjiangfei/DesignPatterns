package com.wangjiangfei.interpreter;

/**
 * 属性作为终结符对应的解释器
 *
 * @author wangjiangfei
 */
public class PropertyTerminalExpression extends ReadXmlExpression {

    /**
     * 属性的名字
     */
    private String propName;

    public PropertyTerminalExpression(String propName) {
        this.propName = propName;
    }

    @Override
    public String[] interpreter(Context context) {
        // 直接获取最后的元素属性的值
        String[] ss = new String[1];
        ss[0] = context.getPreEle().getAttribute(this.propName);
        return ss;
    }
}
