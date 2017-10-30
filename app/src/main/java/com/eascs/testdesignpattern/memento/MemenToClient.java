package com.eascs.testdesignpattern.memento;

/**
 * Create By chao.wang on 2017/10/30 13:36
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：定义：这种方法不是很理想
 * <p>
 * 更改记录：
 */
public class MemenToClient {
    public MemenToClient() {
        Boy boy = new Boy();
        boy.setState("Good");
        Boy boyBack = new Boy();
        boyBack.setState(boy.getState());
        boy.changeState();
        boy.setState(boyBack.getState());
    }
}
