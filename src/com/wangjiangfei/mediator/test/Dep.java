package com.wangjiangfei.mediator.test;

/**
 * 部门类
 *
 * @author wangjiangfei
 */
public class Dep {

    /**
     * 描述部门编号
     */
    private String depId;

    /**
     * 描述部门名称
     */
    private String depName;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    /**
     * 撤销部门
     * @return 是否撤销成功
     */
    public boolean deleteDep() {
        // 要先通过中介者去除掉所有与这个部门相关的部门和人员的关系
        DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
        mediator.deleteDep(depId);
        return true;
    }
}
