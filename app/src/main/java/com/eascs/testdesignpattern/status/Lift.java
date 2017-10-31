package com.eascs.testdesignpattern.status;

import android.util.Log;

/**
 * Create By chao.wang on 2017/10/31 15:47
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public class Lift implements ILift {
    private int state;

    @Override
    public void setStatus(int status) {

    }

    @Override
    public void open() {
        Log.i("CW", "open");
        switch (this.state) {
            case 0:
                break;
            default:
                break;
        }
    }

    @Override
    public void close() {
        Log.i("CW", "close");
        switch (this.state) {
            case 0:
                break;
            default:
                break;
        }
    }

    @Override
    public void run() {
        Log.i("CW", "run");
        switch (this.state) {
            case 0:
                break;
            default:
                break;
        }
    }

    @Override
    public void stop() {
        Log.i("CW", "stop");
        switch (this.state) {
            case 0:
                break;
            default:
                break;
        }
    }

    public void liftRun() {
        switch (this.state) {
            case 0:
                break;
            default:
                break;
        }

    }
}
