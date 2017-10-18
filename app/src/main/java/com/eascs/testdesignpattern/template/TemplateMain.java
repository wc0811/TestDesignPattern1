package com.eascs.testdesignpattern.template;

/**
 * Create By chao.wang on 2017/10/18 13:31
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：这个我的理解就是特别简单，就像Activtity 的生命周期一样；都有那些方法每个方法都按什么顺序走的，就这么简单，有了模版，
 * 有了木板，就是产生多个相同和不同的Activity
 * 定义：定义一个操作中的算法框架，而将一些步骤延迟到子类中，使得子类不改变一个算法的结构，即可重定义，该算法的某些特定步骤
 * 特点：1、封装不便，扩展可变；
 * 2、提取公共部分代码，便于维护；
 * 3、行为由父类控制，由子类实现
 * 缺点：抽象类定义了部分抽象方法，由子类实现，子类执行的结果影响了父类结果，也就是子类对父类产生了影响，在复杂项目中会带来很多的不便；
 * 扩展模板方法：添加变量可以实现控制其中某个方法是否进行
 *
 * <p>
 * 更改记录：
 */
public class TemplateMain {
    private boolean isInitUI = false;

    public TemplateMain(boolean initUI) {
        if (initUI) {
            initUI();
        }
        initData();
    }

    public boolean isInitUI() {
        return isInitUI;
    }

    public void setInitUI(boolean initUI) {
        isInitUI = initUI;
        ;
    }

    private void initData() {
    }

    private void initUI() {
    }
}
