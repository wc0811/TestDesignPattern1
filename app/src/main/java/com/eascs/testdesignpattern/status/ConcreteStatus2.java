package com.eascs.testdesignpattern.status;

/**
 * Create By chao.wang on 2017/10/31 16:13
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：我懂了，就是在一个状态改变的时候，另外一个状态也跟着变
 * 自动变成下一个状态
 * <p>
 * 更改记录：
 */
public class ConcreteStatus2 extends Status {
    @Override
    public void handle1() {
//本状态下必须处理的逻辑
    }

    @Override
    public void handle2() {

    }
}
