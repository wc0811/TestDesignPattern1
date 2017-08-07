package com.eascs.testdesignpattern;

/**
 * Create By chao.wang on 2017/8/7 17:07
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public class FactoryItem extends Factory {
    @Override
    public <T extends ClassSingle1> T creator(Class<T> c) {
        ClassSingle1 classSingle1 = null;
        try {
            classSingle1 = new (ClassSingle1) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) classSingle1;
    }
}
