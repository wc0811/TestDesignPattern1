package com.eascs.testdesignpattern.agency;

import android.util.Log;

/**
 * Create By chao.wang on 2017/9/5 10:56
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public class Stock {
    private static int COMPUTER_NUMBER = 100;

    public void increase(int number) {

        COMPUTER_NUMBER += number;
        Log.v("wangchao", "当前数量为：" + COMPUTER_NUMBER);

    }

    public void decrease(int number) {

        COMPUTER_NUMBER -= number;
        Log.v("wangchao", "当前数量为：" + COMPUTER_NUMBER);
    }

    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

    public void clearStock() {
    }
}
