package com.eascs.testdesignpattern.compose.composenew;

import java.util.ArrayList;

/**
 * Create By chao.wang on 2017/10/27 09:26
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public class Branch implements IBranch {
    private String strNaame;
    private ArrayList list = new ArrayList();

    public Branch(String strNaame) {
        this.strNaame = strNaame;
    }

    @Override
    public String getInfo() {
        return strNaame;
    }

    @Override
    public void add(IBranch iBranch) {
        this.list.add(iBranch);
    }

    @Override
    public void add(ILeaf iLeaf) {
        this.list.add(iLeaf);
    }

    @Override
    public ArrayList getSubordinateInfo() {
        return this.list;
    }
}
