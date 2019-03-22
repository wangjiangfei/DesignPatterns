package com.wangjiangfei.observer.test1;

/**
 * 观察者，比如报纸的的读者
 *
 * @author wangjiangfei
 */
public interface Observer {

    /**
     * 被通知的方法，直接把报纸的内容推送过来
     * @param content 报纸的内容
     */
    void update(String content);
}
