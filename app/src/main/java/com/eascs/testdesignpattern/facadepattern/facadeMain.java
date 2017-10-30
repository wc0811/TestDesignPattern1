package com.eascs.testdesignpattern.facadepattern;

import android.util.Log;

/**
 * Create By chao.wang on 2017/10/30 09:25
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：有点类似于函数的性质，
 * 只需要将必要内容以参数的形式传入到函数中，自然就得到需要的结果
 * 定义：要求一个子系统的外部与其内部的通信，必须通过一个统一的对象进行，
 * 门面模式提供一个高层次的接口，使得子系统，更容易使用
 * 通用代码如下
 * 优点：减少系统的相互依赖（不使用门面模式，访问直接深入到子系统内部，）；
 * <p>
 * 更改记录：
 */
public class facadeMain {
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();

    public facadeMain() {
    }

    private void dealA() {
        a.doThing();
    }

    private void dealB() {
        b.doThing();
    }

    private void dealC() {
        c.doThing();
        Log.v("TEST", "Good");
    }
}
