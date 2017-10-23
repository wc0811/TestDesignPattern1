package com.eascs.testdesignpattern.chain;

/**
 * Create By chao.wang on 2017/10/23 09:15
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public class Father implements IHandler {
    @Override
    public void handlerMessage(IWomen women) {
//女儿的请示是
//父亲的答复是
//        简而言之，从这个位置，一点点的往下走
    }

    @Override
    public void nextChain() {

    }

    @Override
    public void response() {

    }
}
