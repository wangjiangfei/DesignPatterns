package com.wangjiangfei.observer.test3;

/**
 * 具体的水质监测对象
 *
 * @author wangjiangfei
 */
public class WaterQuality extends WaterQualitySubject {

    /**
     * 污染的级别，0表示正常，1表示轻度污染，2表示中度污染，3表示高度污染
     */
    private int polluteLevel = 0;

    /**
     * 获取水质污染的级别
     * @return 水质污染的级别
     */
    @Override
    public int getPolluteLevel() {
        return polluteLevel;
    }

    /**
     * 当监测水质情况后，设置水质污染的级别
     * @param polluteLevel 水质污染的级别
     */
    public void setPolluteLevel(int polluteLevel) {
        this.polluteLevel = polluteLevel;
        // 通知相应的观察者
        this.notifyWatchers();
    }

    /**
     * 通知相应的观察者对象
     */
    @Override
    public void notifyWatchers() {
        // 循环所有注册的观察者
        for (WatcherObserver watcher : observers) {
            // 开始根据污染级别判断是否需要通知，由这里总控
            if (this.polluteLevel >= 0) {
                if ("监测人员".equals(watcher.getJob())) {
                    // 通知检测员做记录
                    watcher.update(this);
                }
            }
            if (this.polluteLevel >= 1) {
                if ("预警人员".equals(watcher.getJob())) {
                    // 通知预警人员
                    watcher.update(this);
                }
            }
            if (this.polluteLevel >= 2) {
                if ("监测部门领导".equals(watcher.getJob())) {
                    // 通知监测部门领导
                    watcher.update(this);
                }
            }
        }
    }

}
