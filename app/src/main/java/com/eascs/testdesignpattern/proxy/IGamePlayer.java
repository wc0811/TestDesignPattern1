package com.eascs.testdesignpattern.proxy;

/**
 * Create By chao.wang on 2017/10/19 10:14
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：代理模式，首先定义一个基本的操作类
 * <p>
 * 更改记录：
 */
public interface IGamePlayer {
    public void login(String pStrId, String pStrPwd);

    public void killBoss();

    public void upgrade();
}
