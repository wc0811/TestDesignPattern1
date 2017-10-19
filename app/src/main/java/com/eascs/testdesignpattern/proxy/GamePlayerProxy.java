package com.eascs.testdesignpattern.proxy;

/**
 * Create By chao.wang on 2017/10/19 10:17
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public class GamePlayerProxy implements IGamePlayer, IProxy {
    private GamePlayer gamePlayer;

    public GamePlayerProxy(GamePlayer player) {
        this.gamePlayer = player;
    }

    @Override
    public void login(String pStrId, String pStrPwd) {

    }

    @Override
    public void killBoss() {

    }

    @Override
    public void upgrade() {

    }

    @Override
    public void count() {
//        特有性质，代理自己的方法
    }
}
