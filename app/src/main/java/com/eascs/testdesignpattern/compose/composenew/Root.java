package com.eascs.testdesignpattern.compose.composenew;

import java.util.ArrayList;

/**
 * Create By chao.wang on 2017/10/27 09:21
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：对于一个根节点来说，他要实现的功能特别的简单，
 * 就是完成最基本的添加，和遍历
 * <p>
 * 更改记录：
 */
public class Root implements IRoot {
    private ArrayList list = new ArrayList();
    private String strNaame;

    public Root(String strNaame) {
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
