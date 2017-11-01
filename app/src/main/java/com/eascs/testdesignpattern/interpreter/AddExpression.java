package com.eascs.testdesignpattern.interpreter;

import java.util.HashMap;

/**
 * Create By chao.wang on 2017/11/1 09:27
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：抽象函数的构造函数，需要子类来继承
 * <p>
 * 更改记录：
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expressino left, Expressino right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
