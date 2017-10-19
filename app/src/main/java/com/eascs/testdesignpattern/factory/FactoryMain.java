package com.eascs.testdesignpattern.factory;

/**
 * Create By chao.wang on 2017/10/18 08:55
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：用处非常多，定义一个创建对象的接口，让子类决定实例化那个类，使类的实例话延迟到子类，最主要的就是屏蔽了产品类
 * 1、不用工厂模式的时候我们是new 出一个数据来；
 * 2、有了工厂模式，我们就简单的让工厂类负责去创建类，也就是具体的实例化由工厂类决定
 * 3、工厂方法模式，产品系列越来越多，可以分为多个工厂，每个具体工厂创建一类具体商品，
 * 4、对产品进行改动的时候，修改具体的商品类
 * 在创建商品对象的时候，仅仅需要知道商品的类名就可以了，不用知道具体创建过程的艰辛，降低了模块间的耦合
 * 增加可扩展性，可扩展性提高的很大，增加一个类，就增加了一种产品
 * 屏蔽产品类，不需要知道产品类的具体细节，仅仅需要知道产品类之间的内容就可以了
 * mvp系统之间的P And V 是不是都是两个不同的产品那，答案是肯定的，貌似我还用到了，就这么简单
 * 当一个系统用到的东西都是好的，那就完美了
 * 工厂模式是非常容易扩展的
 * 抽象工厂，是工厂的扩展，具体什么情况还得待定：
 * 定义：为创建一组相关或相互依赖的对象提供一个接口，而无需指定他们的具体类
 * 简单而讲就是一个对象族有相同的约束；
 * <p>
 * 更改记录：
 */
public class FactoryMain {
    public FactoryMain() {
        AbstractHumanFactory factory = new HumanFactory();
    }
}