package com.eascs.testdesignpattern.prototype;

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
}
