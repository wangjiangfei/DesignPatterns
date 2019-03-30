package com.wangjiangfei.templateMethod;

/**
 * 普通用户登录控制的逻辑处理
 *
 * @author wangjiangfei
 */
public class NormalLogin extends LoginTemplate {

    @Override
    public LoginModel findLoginUser(String loginId) {
        // 返回一个有默认数据的对象
        LoginModel lm = new LoginModel();
        lm.setLoginId(loginId);
        lm.setPwd("testpwd");
        return lm;
    }
}
