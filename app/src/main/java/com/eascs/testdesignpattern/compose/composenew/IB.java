package com.eascs.testdesignpattern.compose.composenew;

/**
 * Create By chao.wang on 2017/10/27 10:51
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：只要是树形，就要考虑使用组合模式，只要是提现局部和整体的关系时，而且这种关系比较深，考虑使用组合模式
 * <p>
 * 更改记录：正常工作过程中还有其他的问题，现在暂时不弄了
 */
public interface IB {
    public void add();

    public void remove();

    public void getSub();
}
