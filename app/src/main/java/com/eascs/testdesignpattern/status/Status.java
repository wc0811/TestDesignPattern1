package com.eascs.testdesignpattern.status;

import android.content.Context;

/**
 * Create By chao.wang on 2017/10/31 16:11
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public abstract class Status {
    protected Context context;//声明一个环境角色，提供各个状态类，自行访问，

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void handle1();

    public abstract void handle2();
}
