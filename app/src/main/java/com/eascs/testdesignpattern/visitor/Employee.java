package com.eascs.testdesignpattern.visitor;

/**
 * Create By chao.wang on 2017/10/31 10:56
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public abstract class Employee {
    public final static int MALE = 0;//男性
    public final static int FEMALE = 0;//女性
    private String name;
    private int salay;
    private int sex;

    /**
     * 优化处理，删除掉当前两个方法
     *
     * @return
     */
//    public final void report() {
//        String strInfo = "";
//        strInfo += "姓名：" + this.name + "\r\n" +
//                "薪水：" + this.getSalay() + "\r\n" +
//                "性别：" + (this.sex == FEMALE ? "女" : "男")
//                + this.getOterInfo();
//    }
//
//    protected abstract String getOterInfo();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalay() {
        return salay;
    }

    public void setSalay(int salay) {
        this.salay = salay;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    //允许一个访问者访问，在内部封装起来，增加一行，实现允许访问者访问当前数据
    public abstract void accept(IVisitor visitor);
}
