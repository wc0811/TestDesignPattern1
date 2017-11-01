package com.eascs.testdesignpattern.bridge;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Create By chao.wang on 2017/10/9 10:39
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：将操作和数据库分割开来，实现两者的分离
 * <p>
 * 更改记录：
 */
public class BridgeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //桥梁模式
        /**
         * 将抽象和实现解耦，使得两者可以独立的变化
         * 1、重点在于解耦，如和解耦得看典型的直接类
         * 每个模式都有通用类，这个桥梁模式也如此
         * 1:Abstraction:抽象化角色：定义出该角色的行为，同时保存一个对实现化角色的应用，该角色一般是抽象类；
         * 2、implementor:实现化角色：它是接口或这抽象类，定义角色必须的行为和属性；
         * 3、RefinedAbstraction修正角色属性
         * 4、concreteeImplementor:具体实现化角色
         * 桥梁模式的目的是让底接口上上层接口可以分别演化，从而提高移植性
         * 强调接口对象仅实现基本实现，往往提供的是操作控件，操作算法
         * 接口对象就是现成的算法，不需要进行组合判断
         * 遥控器的设计代码，首先需要明白uml图，然后再去看其他的内容，协议或接口的实现方式是不同的
         * 遥控器的界面和变化，就是一个抽象的体系，这个抽象类据欧最基本的功能
         * 一个厂家灭法调用其的厂家的电视机
         * 原来mvp 就是一个桥梁模式，所谓的桥梁模式，就比如一个接口，将实体类和操作类，连接起来
         *非常有必要对UML进行理解，有了对UML的理解才好进行下一步；
         * 有三种基本构造模块：事务、关系、图
         * 抽象化角色：具体抽象化角色
         *实现化角色，具体实现化角色
         * */

    }
}
