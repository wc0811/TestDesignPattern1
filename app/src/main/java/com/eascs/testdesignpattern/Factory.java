package com.eascs.testdesignpattern;

/**
 * Create By chao.wang on 2017/8/7 17:03
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public abstract class Factory {

    public abstract <T extends ClassSingle1> T creator(Class<T> c);
}
