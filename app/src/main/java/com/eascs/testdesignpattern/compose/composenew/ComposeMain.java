package com.eascs.testdesignpattern.compose.composenew;

import android.util.Log;

import java.util.ArrayList;

/**
 * Create By chao.wang on 2017/10/27 09:14
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：对于组合模式而言：最主要的思想就是，使简单处理和复杂处理，都抽象到简单处理上
 * 注意，当前类，仍旧可以优化，如何优化，自行解决
 * 三个元素：第一个抽象类，第二个，树枝的构建，第三个树叶的构建
 * 组合模式的重点在于树枝和树叶的构建
 * <p>
 * 更改记录：
 */
public class ComposeMain {
    public ComposeMain() {
        IRoot ceo = new Root("ceo");
        IBranch b1 = new Branch("b1");
        IBranch b2 = new Branch("b2");
        IBranch b3 = new Branch("b3");
        IBranch b11 = new Branch("b11");
        IBranch b22 = new Branch("b22");
        IBranch b33 = new Branch("b33");
        ILeaf l1 = new Leaf("l1");
        ILeaf l2 = new Leaf("l2");
        ILeaf l3 = new Leaf("l3");
        ILeaf l4 = new Leaf("l4");
        ILeaf l5 = new Leaf("l5");
        ILeaf l6 = new Leaf("l6");
        ILeaf l7 = new Leaf("l7");
        ILeaf l8 = new Leaf("l8");
        ILeaf l9 = new Leaf("l9");
        ILeaf l25 = new Leaf("25");

        ceo.add(b1);
        ceo.add(b2);
        ceo.add(b3);
        ceo.add(l25);

        b1.add(b11);
        b2.add(b22);
        b3.add(b33);
        b1.add(l1);
        b1.add(l2);
        b1.add(l3);
        b2.add(l4);
        b2.add(l5);
        b2.add(l6);
        b3.add(l7);
        b3.add(l8);
        b3.add(l9);
        Log.v("EAWSD", "分支" + ceo.getInfo());
        getAllSubInfo(ceo.getSubordinateInfo());

    }

    private void getAllSubInfo(ArrayList subordinateInfo) {
        int iLength = subordinateInfo.size();
        for (int i = 0; i < iLength; i++) {
            Object o = subordinateInfo.get(i);
            if (o instanceof Leaf) {
                ILeaf leaf = (Leaf) o;
                Log.v("EAWSD", "叶子" + leaf.getInfo());
            } else {
                IBranch branch = (IBranch) o;
                Log.v("EAWSD", "分支" + branch.getInfo());
                getAllSubInfo(branch.getSubordinateInfo());
            }
        }
    }
}
