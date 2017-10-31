package com.eascs.testdesignpattern.visitor;

/**
 * Create By chao.wang on 2017/10/31 11:39
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public class Manager extends Employee {
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    @Override
    protected String getOterInfo() {
        return "\r\n" + "业绩：" + this.getPerformance() + "\r\n";
    }
}
