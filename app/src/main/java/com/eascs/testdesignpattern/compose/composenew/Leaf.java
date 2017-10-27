package com.eascs.testdesignpattern.compose.composenew;

/**
 * Create By chao.wang on 2017/10/27 09:27
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public class Leaf implements ILeaf {
    String strName;

    public Leaf(String strName) {
        this.strName = strName;
    }

    @Override
    public String getInfo() {
        return this.strName;
    }
}
