package com.eascs.testdesignpattern.chain;

/**
 * Create By chao.wang on 2017/10/23 09:09
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public class Women implements IWomen {
    private int itype;
    private String strRequest;

    public Women(int itype, String request) {
        itype = itype;
        this.strRequest = request;
    }

    @Override
    public int getType() {
        return itype;
    }

    @Override
    public String getRequest() {
        return strRequest;
    }
}
