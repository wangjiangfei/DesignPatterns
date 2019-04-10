package com.wangjiangfei.interpreter;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 元素作为非终结符对应的解释器，解释并执行中间元素
 *
 * @author wangjiangfei
 */
public class ElementExpression extends ReadXmlExpression {

    /**
     * 用来记录组合的ReadXmlExpression元素
     */
    private Collection<ReadXmlExpression> eles = new ArrayList<>();

    /**
     * 元素的名称
     */
    private String eleName = "";

    public ElementExpression(String eleName) {
        this.eleName = eleName;
    }

    // 对子元素的维护
    public boolean addEle(ReadXmlExpression ele) {
        this.eles.add(ele);
        return true;
    }
    public boolean removeEle(ReadXmlExpression ele) {
        this.eles.remove(ele);
        return true;
    }

    @Override
    public String[] interpreter(Context context) {
        // 先取出上下文中的当前元素作为父级元素
        // 查找到当前元素名称所对应的xml元素，并设置回到上下文中
        Element pEle = context.getPreEle();
        if (pEle == null) {
            // 说明现在获取的是根元素
            context.setPreEle(context.getDocument().getDocumentElement());
        } else {
            // 根据父级元素和要查找的元素的名称来获取当前的元素
            Element nowEle = context.getNowEle(pEle, eleName);
            // 把当前获取的元素放到上下文中
            context.setPreEle(nowEle);
        }
        // 循环调用子元素的interpreter方法
        String[] ss = null;
        for (ReadXmlExpression ele : eles) {
            ss = ele.interpreter(context);
        }
        return ss;
    }
}
