package com.wangjiangfei.templateMethod;

/**
 * 登录控制的模板
 *
 * @author wangjiangfei
 */
public abstract class LoginTemplate {

    /**
     * 判断登录数据是否正确，也就是是否能登录成功
     * @param lm
     * @return
     */
    public final boolean login(LoginModel lm) {
        // 1、根据登录人员的编号去获取相应的数据
        LoginModel dbLm = this.findLoginUser(lm.getLoginId());
        if (dbLm != null) {
            // 2、对密码进行加密
            String encryptPwd = this.encryptPwd(lm.getPwd());
            // 把加密后的密码设置回到登录数据模型中
            lm.setPwd(encryptPwd);
            // 3、判断是否匹配
            return this.match(lm, dbLm);
        }
        return false;
    }

    /**
     * 根据登录编号来查找和获取存储中相应的数据
     * @param loginId 登录编号
     * @return
     */
    public abstract LoginModel findLoginUser(String loginId);

    /**
     * 对密码数据进行加密
     * @param pwd 密码数据
     * @return 加密后的密码数据
     */
    public String encryptPwd(String pwd) {
        return pwd;
    }

    /**
     * 判断用户填写的登录数据和存储中对应的数据是否匹配得上
     * @param lm
     * @param dbLm
     * @return
     */
    public boolean match(LoginModel lm, LoginModel dbLm) {
        if (lm.getLoginId().equals(dbLm.getLoginId())
                && lm.getPwd().equals(dbLm.getPwd())) {
            return true;
        }
        return false;
    }
}
