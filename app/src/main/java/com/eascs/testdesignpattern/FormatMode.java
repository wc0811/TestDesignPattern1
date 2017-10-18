package com.eascs.testdesignpattern;

/**
 * Create By chao.wang on 2017/8/18 16:16
 * <p>
 * email：wc0811@163.com
 * <p>
 * 传说中策略模式与模版模式相似
 * 类描述：模版模式-好莱坞原则-明星和各种角色的解耦-具体步骤和有父类来做-模版模式：封装的是步骤，策略模式，是对方法族的封装，模版模式，定义出具体的行为，策略模式通过接口委托，
 * 模版方式，是通过继承来实现的
 * 做框架，就是模版模式，模版模式方便做矿建：算法，抽象化为具体的内容，通用的普遍性的模版模式原理
 * <p>
 * 更改记录：
 */
public class FormatMode implements Cloneable {
    //有些步骤和方法是需要子类实现的


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
