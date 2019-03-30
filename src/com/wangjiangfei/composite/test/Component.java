package com.wangjiangfei.composite.test;

public abstract class Component {

    /**
     * 记录每个组件的路径
     */
    private String componentPath = "";

    /**
     * 获取组件的路径
     * @return 组件的路径
     */
    public String getComponentPath() {
        return componentPath;
    }

    /**
     * 设置组件的路径
     * @param componentPath 组件的路径
     */
    public void setComponentPath(String componentPath) {
        this.componentPath = componentPath;
    }

    /**
     * 获取组件的名称
     * @return 组件的名称
     */
    public abstract String getName();

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
