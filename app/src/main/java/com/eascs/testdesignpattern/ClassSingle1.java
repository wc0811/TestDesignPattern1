package com.eascs.testdesignpattern;

/**
 * Create By chao.wang on 2017/8/7 15:34
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public class ClassSingle1 {
    /**
     * 单例模式在项目中经常使用，有多种实现方法，下面是我通常使用的方法
     */
    /**
     * 私有的，是类的对象，仅仅能在类内部new
     */
    private static ClassSingle1 t;//声明而不实例化，在getInstance中实例化（仅有new 了以后才占用  内存）

    /**
     * 单例实现的方法
     *
     * @return
     */
    public static ClassSingle1 getInstance() {//非常好资源，因此

        /**
         * 相对更为严禁的写法，可以先看上一个，这个慢慢来
         */
        if (null == t) {
            synchronized (ClassSingle1.class) {
                if (null == t) {
                    t = new ClassSingle1();
                }
            }
        }
        return t;

    }

}
