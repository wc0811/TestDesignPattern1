package com.eascs.testdesignpattern.strategy;

/**
 * Create By chao.wang on 2017/10/23 14:04
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：策略的总处理人
 * <p>
 * 更改记录：
 */
public class StrategyContext {
    private IStrategy strategy;

    public StrategyContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.opreate();
    }

}
