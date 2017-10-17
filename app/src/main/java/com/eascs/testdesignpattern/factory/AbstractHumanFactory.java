package com.eascs.testdesignpattern.factory;

/**
 * Create By chao.wang on 2017/10/17 14:44
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> tClass);
}
