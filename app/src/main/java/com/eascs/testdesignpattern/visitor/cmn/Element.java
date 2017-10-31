package com.eascs.testdesignpattern.visitor.cmn;

import com.eascs.testdesignpattern.visitor.IVisitor;

/**
 * Create By chao.wang on 2017/10/31 14:29
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：优点：1、符合单一原则；2、优秀的扩展性；3、灵活性高；
 * 缺点：抛弃了对抽象类的依赖，直接对具体类进行操作，扩展困难
 * <p>
 * 更改记录：
 */
public abstract class Element {
    public abstract void doSomething();//定义业务逻辑

    public abstract void accept(IVisitor visitor);//允许谁来访问
}
