package com.eascs.testdesignpattern.interpreter;

/**
 * Create By chao.wang on 2017/11/1 09:24
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：抽象运算符解释器
 * <p>
 * 更改记录：
 */
public abstract class SymbolExpression extends Expressino {
    public Expressino left;
    public Expressino right;

    public SymbolExpression(Expressino left, Expressino right) {
        this.left = left;
        this.right = right;
    }
}
