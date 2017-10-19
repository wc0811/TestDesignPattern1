package com.eascs.testdesignpattern.prototype;

/**
 * Create By chao.wang on 2017/10/19 14:15
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public class ConcreteProtype2 implements Prototype {
    @Override
    public Prototype clone() {
        Prototype prototype = new ConcreteProtype2();
        return prototype;
    }
}
