package com.eascs.testdesignpattern.visitor.cmn;

import com.eascs.testdesignpattern.visitor.IVisitor;

/**
 * Create By chao.wang on 2017/10/31 14:29
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public abstract class Element {

    public abstract void doSomething();//定义业务逻辑

    public abstract void accept(IVisitor visitor);//允许谁来访问
}
