package com.eascs.testdesignpattern.bridge;

/**
 * Create By chao.wang on 2017/10/12 15:11
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public abstract class Abtraction {
    //定义对实现化角色的引用
    private Implementor imp;

    public Abtraction(Implementor pImp) {
        this.imp = pImp;
    }

    public void request() {
        this.imp.doSomeThing();
    }

    //获得实现化角色
    public Implementor getImp() {
        return imp;
    }
}
