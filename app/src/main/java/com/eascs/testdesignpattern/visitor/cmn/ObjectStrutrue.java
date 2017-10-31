package com.eascs.testdesignpattern.visitor.cmn;

import java.util.Random;

/**
 * Create By chao.wang on 2017/10/31 14:44
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：简单的处理方式，一样的完成响应的任务
 * 通过访问者访问，只要是具体元素就非常容易访问，对元素的遍历就更加容易了，甭管他是什么对象，只要他在一个容器中，都可以通过访问者来访问，任务集中化，这就是访问者模式
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

        for (int i = 0; i < 10; i++) {
//            Element e1 = new ObjectStrutrue();获取元素对象
//            e1.accept(new Visitor());接受访问者访问
        }
    }
}
