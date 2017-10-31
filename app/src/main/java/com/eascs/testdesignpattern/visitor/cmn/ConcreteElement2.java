package com.eascs.testdesignpattern.visitor.cmn;

import com.eascs.testdesignpattern.visitor.IVisitor;

/**
 * Create By chao.wang on 2017/10/31 14:36
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：有两个具体的实例，进一步做操作
 * <p>
 * 更改记录：
 */
public class ConcreteElement2 extends Element {
    //完善业务逻辑
    @Override
    public void doSomething() {

    }

    //允许那个访问者访问
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
