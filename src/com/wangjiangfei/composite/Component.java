package com.wangjiangfei.composite;

/**
 * 抽象的组件对象
 *
 * @author wangjiangfei
 */
public abstract class Component {

    /**
     * 输出组件自身的名称
     * @param preStr
     */
    public abstract void printStruct(String preStr);

    /**
     * 向组合对象中加入组件对象
     * @param child 被加入组合对象中的组件对象
     */
    public void addChild(Component child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

}
