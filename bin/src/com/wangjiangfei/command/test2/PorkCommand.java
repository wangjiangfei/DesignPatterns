package com.wangjiangfei.command.test2;

/**
 * 命令对象，蒜泥白肉
 *
 * @author wangjiangfei
 */
public class PorkCommand implements Command {

    /**
     * 持有具体做菜的厨师的对象
     */
    private CookApi cookApi = null;

    /**
     * 设置具体做菜的厨师的对象
     * @param cookApi 具体做菜的厨师的对象
     */
    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }

    @Override
    public void execute() {
        this.cookApi.cook("蒜泥白肉");
    }
}
