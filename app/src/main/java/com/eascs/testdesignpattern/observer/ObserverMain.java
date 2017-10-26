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
 * <p>
 * 优点：1、观察者和被观察者之间是抽象耦合的，无论增加观察者还是被观察者都非常容易；
 * 2、建立一套触发机制，单一职责原则，每个类的职责是单一的，观察者可以实现一个串联的(如蝴蝶效应的一个链式响应)
 * 缺点：开发效率和运行效率都有一定的问题；
 * 一个被观察者，多个观察者，导致开发和调试比较复杂，java中，消息默认是顺序执行的，一个观察者卡壳，会影响整体的执行效率，
 * 而且触发式的效率不是很理想
 * 使用场景：1、关联行为场景，关联是可拆分的而不是组合关系，
 * 2、事件多级触发，
 * 3、跨系统的消息交换场景，如消息队列的处理机制
 * 注意事项：1、广播链的问题：消息被多次转发后，倒置效率超级低，一点效用都没有，道可道，非常道
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
