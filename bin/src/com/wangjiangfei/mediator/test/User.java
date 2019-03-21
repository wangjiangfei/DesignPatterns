package com.wangjiangfei.mediator.test;


/**
 * 人员类
 *
 * @author wangjiangfei
 */
public class User {

    /**
     * 人员编号
     */
    private String userId;

    /**
     * 人员名称
     */
    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 人员离职
     * @return 是否处理成功
     */
    public boolean dimission() {
        // 要先通过中介者去除掉所有与这个人员相关的部门和人员的关系
        DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
        mediator.deleteUser(userId);
        return true;
    }
}
