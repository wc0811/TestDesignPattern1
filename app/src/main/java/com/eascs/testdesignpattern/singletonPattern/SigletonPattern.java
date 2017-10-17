package com.eascs.testdesignpattern.singletonPattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * Create By chao.wang on 2017/10/17 13:29
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：什么是单例，单例的好处是什么，延缓初始化
 * <p>
 * 更改记录：
 */
public class SigletonPattern {
    private static SigletonPattern sgp1;
    private static SigletonPattern sgp2;
    private ArrayList<SigletonPattern> list = new ArrayList<SigletonPattern>();
    public static SigletonPattern getSgp(int iRandom) {
        if (iRandom % 2 == 0) {
            return sgp1;
        } else {
            return sgp2;
        }
    }


    //java的构造函数是没有返回值的，返回值是什么都是假的,双重枷锁的单例模式
    /*
    * 优点1、仅存在一个单例，减少内存开支，特别是频繁创建和销毁的；
    * 2、可以在全局设置访问点，优化和共享资源访问，如，可以设计一个单例类，负责所有数据表的映射
    * 缺点1、没有接口，接口和抽象类是不能实例化的，而单例模式需要“自行实例化”
    * 2、测试时，单例未完成，不能测试
    * 适用环境：需要定义大量静态变量和静态方法（如工具类）；可以单例模式，也可以直接声明为static方式
    * 除了单例模式，还有多列模式，具体定义方法待定
    *
    * */
    public SigletonPattern() {
        if (null == sgp2) {
            synchronized (SigletonPattern.class) {
                sgp2 = new SigletonPattern();
            }
        }
    }

    public SigletonPattern(String str) {
        int iRandom;
        if (null == sgp2) {
            synchronized (SigletonPattern.class) {
                sgp2 = new SigletonPattern("");
                Random random = new Random();
                iRandom = random.nextInt(100);

            }
        }
    }

    static {
    }
}
