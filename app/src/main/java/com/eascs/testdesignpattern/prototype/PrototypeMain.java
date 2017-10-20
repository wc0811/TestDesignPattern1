package com.eascs.testdesignpattern.prototype;

import java.util.ArrayList;

/**
 * Create By chao.wang on 2017/10/19 12:19
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：核心思想是copy.clone
 * 1、优点：性能优良；copy 二进制流的copy,要比直接new 一个对象好很多，快
 * 2、避免构造函数的约束：减少约束，就代表在需要的时候是需要考虑清楚的
 * 3、一个对象需要提供给其他对象访问，而且各个调用者都可能需要修改其值，可以考虑使用原型模式copy 多个对象供调用者使用
 * 4、典型的浅拷贝就是这么简单，简单到你只需要了解其具体内容就可以完成所需要的东西了
 * <p>
 * 更改记录：
 */
public class PrototypeMain {
    public PrototypeMain() {
        //显示的是最基本的内容类
    }

    //浅拷贝
    public class Prototype implements Cloneable {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object clone() {
            try {
                return super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                return null;
            }
        }

    }

    private void testPrototype() {
        Prototype pro = new Prototype();
        pro.setName("original object");
        Prototype pro1 = (Prototype) pro.clone();
        pro.setName("changed object1");

        System.out.println("original object:" + pro.getName());
        System.out.println("cloned object:" + pro1.getName());

    }

    /*
    * 由于ArrayList不是基本类型，
    * 所以成员变量list，不会被拷贝，
    * 需要我们自己实现深拷贝，
    * 幸运的是java提供的大部分的容器类都实现了Cloneable接口。
    * 所以实现深拷贝并不是特别困难。*/
    public class PrototypeCWTest implements Cloneable {
        private ArrayList listTemp = new ArrayList();

        public PrototypeCWTest clone() {
            PrototypeCWTest prototype = null;
            try {
                prototype = (PrototypeCWTest) super.clone();
                prototype.listTemp = (ArrayList) this.listTemp.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return prototype;
        }
    }
    /*
    * 使用原型模式复制对象不会调用类的构造方法。
    * 因为对象的复制是通过调用Object类的clone方法来完成的，
    * 它直接在内存中复制数据，因此不会调用到类的构造方法。
    * 不但构造方法中的代码不会执行，甚至连访问权限都对原型模式无效。
    * 还记得单例模式吗？单例模式中，只要将构造方法的访问权限设置为private型，
    * 就可以实现单例。但是clone方法直接无视构造方法的权限，所以，单例模式与原型模式是冲突的，在使用时要特别注意。
    * 深拷贝与浅拷贝：Object类的clone方法只会拷贝对象中的基本的数据类型，
    * 对于数组、容器对象、引用对象等都不会拷贝，这就是浅拷贝。
    * 如果要实现深拷贝，必须将原型模式中的数组、容器对象、引用对象等另行拷贝。
    * 还有一点注意的事项，就是clone和final 是对立的两个东西，当final的变量在clone的时候会出现编译错误*/


    //原来所谓的原型模式，就是简单的实现cloneable方法，clone出具体的数据来
    //塞翁失马焉知非福；大脑现在各种清晰，清晰的各种思路
    //我认为原型模式适用的场景，就是大部分内容都是相同的，仅有部分变量可以临时设置
}
