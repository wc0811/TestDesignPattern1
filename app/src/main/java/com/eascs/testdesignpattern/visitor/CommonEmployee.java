package com.eascs.testdesignpattern.visitor;

/**
 * Create By chao.wang on 2017/10/31 11:08
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public class CommonEmployee extends Employee {

    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(IVisitor visitor) {

    }

//    @Override
//    protected String getOterInfo() {
//        return "\r\n" + "工作：" + this.job + "\r\n";
//    }
}
