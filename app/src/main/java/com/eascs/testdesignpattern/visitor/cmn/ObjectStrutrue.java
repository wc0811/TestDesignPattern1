package com.eascs.testdesignpattern.visitor.cmn;

import java.util.Random;

/**
 * Create By chao.wang on 2017/10/31 14:44
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：简单的处理方式，一样的完成响应的任务
 * <p>
 * 更改记录：
 */
public class ObjectStrutrue {
    //通过一个工厂方式模拟
    public ObjectStrutrue() {
        Random rand = new Random();
        if (rand.nextInt(100) > 50) {
            new ConcreteElement1();
        } else {
            new ConcreteElement2();
        }
    }
}
