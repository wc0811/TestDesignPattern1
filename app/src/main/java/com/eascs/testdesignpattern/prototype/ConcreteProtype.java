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
public class ConcreteProtype implements Prototype {
    @Override
    public Prototype clone() {
        Prototype prototype = new ConcreteProtype();
        return prototype;
    }
}
