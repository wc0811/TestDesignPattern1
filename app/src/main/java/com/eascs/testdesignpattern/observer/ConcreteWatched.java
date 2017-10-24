package com.eascs.testdesignpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Create By chao.wang on 2017/10/24 09:29
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public class ConcreteWatched implements IWatched {
    private List<AbstractWatcher> list = new ArrayList<AbstractWatcher>();

    @Override
    public void addWatcher(AbstractWatcher watcher) {
        list.add(watcher);
    }

    @Override
    public void deleteWatcher(AbstractWatcher watcher) {
        if (null != list && list.size() > 0) {
            list.remove(watcher);
        }
    }

    @Override
    public void deleteAllWatcher() {
        if (null != list) {
            list.clear();
        }
    }

    /*
    *  当状态发生变化时，提示所有观察者更新
    * */
    @Override
    public void changeStatus() {
        for (AbstractWatcher o : list) {
            o.update();
        }
    }
}
