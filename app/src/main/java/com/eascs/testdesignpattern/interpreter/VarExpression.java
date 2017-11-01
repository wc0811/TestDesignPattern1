package com.eascs.testdesignpattern.interpreter;

import java.util.HashMap;

/**
 * Create By chao.wang on 2017/11/1 09:18
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public class VarExpression extends Expressino {
    private String strKey;

    public VarExpression(String strKey) {
        this.strKey = strKey;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(strKey);
    }
}
