package com.eascs.testdesignpattern.observer;

/**
 * Create By chao.wang on 2017/10/24 09:25
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public interface IWatched {
    public void addWatcher(AbstractWatcher watcher);

    public void deleteWatcher(AbstractWatcher watcher);

    public void deleteAllWatcher();

    public void changeStatus();
}
