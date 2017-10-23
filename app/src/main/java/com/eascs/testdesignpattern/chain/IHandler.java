package com.eascs.testdesignpattern.chain;

/**
 * Create By chao.wang on 2017/10/23 09:13
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：具有处理权限的人
 * 1.1 对上述内容进行优化:这样做的优点就是非常明确的决定什么人该做什么事，是我的事，
 * 我先判断是否需要是我做，假如不是，那么向下传递，传递给下面第一个环节处理，直到处理完成为准
 * <p>
 * <p>
 * 更改记录：
 */
public interface IHandler {
    public void handlerMessage(IWomen women);

    /*
    * 1.1
    * */
    public void nextChain();

    public void response();//对内容进行回应
    /*
    * 1.1
    * */
}
