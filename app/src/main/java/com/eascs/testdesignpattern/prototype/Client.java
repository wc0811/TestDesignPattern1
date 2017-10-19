package com.eascs.testdesignpattern.prototype;

/**
 * Create By chao.wang on 2017/10/19 14:20
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    private void operation(Prototype example) {
        Prototype prototypeCopy = (Prototype) prototype.clone();
    }

}
