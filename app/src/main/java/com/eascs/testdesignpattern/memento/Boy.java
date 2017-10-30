package com.eascs.testdesignpattern.memento;

import android.util.Log;

/**
 * Create By chao.wang on 2017/10/30 13:33
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 * 1.1 增加保存状态和回复状态方法
 */
public class Boy {
    private String state = "";


    public void changeState() {
        Log.i("CW", "心情不好");
    }


    public String getState() {
        Log.i("CW", "心情状态：" + state);
        return state;
    }

    public void setState(String state) {
        Log.i("CW", "设置状态" + state);
        this.state = state;
    }

    public Memento createMemento() {
        Log.i("CW", "保存状态" + state);
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getStatus();
    }
}
