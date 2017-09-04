package com.eascs.testdesignpattern;

/**
 * Create By chao.wang on 2017/8/7 17:03
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：CloneAble　是每个累，自己保存但是可以不实现的类的接口，他的作用之一
 * <p>
 * 更改记录：
 */
public abstract class Factory implements Cloneable {

    /**
     * 可以利用一些东西完成一些想要完成的东西
     * @param c
     * @param <T>
     * @return
     */
    public abstract <T extends ClassSingle1> T creator(Class<T> c);
}
