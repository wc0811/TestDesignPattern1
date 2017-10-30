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
 */
public class Boy {
    private String state = "";


    public void changeState() {
        Log.v("CW", "心情不好");
    }


    public String getState() {
        Log.v("CW", state);
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
