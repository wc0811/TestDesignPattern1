package com.eascs.testdesignpattern.compose.composenew;

import java.util.ArrayList;

/**
 * Create By chao.wang on 2017/10/27 09:03
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public interface IRoot {

    public String getInfo();

    public void add(IBranch iBranch);

    public void add(ILeaf iLeaf);

    public ArrayList getSubordinateInfo();//添加节点后，要知道没个节点的具体内容

}
