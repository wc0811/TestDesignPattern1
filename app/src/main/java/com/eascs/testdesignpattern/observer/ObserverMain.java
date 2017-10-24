package com.eascs.testdesignpattern.observer;

/**
 * Create By chao.wang on 2017/10/24 09:08
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述： 观察者模式：常见的设计模式之一，在项目中经常要用到，非常有用
 * 定义：1vN的关系，让观察者对象，同时监听某一主题对象，这个主题 对象在状态上发生变化时，
 * 会通知所有观察者，让他们自动更新
 * 一个1VN的关系
 * <p>
 * Java也提供了对观察者模式的内置支持
 * 更改记录：
 */
public class ObserverMain {
    private IWatched watched = new ConcreteWatched();
    private AbstractWatcher watcherOne = new ConcreteWatcher();
    private AbstractWatcher watcherTwo = new ConcreteWatcher();

    public ObserverMain() {
        watched.addWatcher(watcherOne);
        watched.addWatcher(watcherTwo);
        watched.changeStatus();
    }
}
