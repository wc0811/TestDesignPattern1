package com.eascs.testdesignpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.eascs.testdesignpattern.visitor.VisitorMain;

import java.util.Collection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getCollection();
//        new ComposeMain();
//        new MemenToClient();
        new VisitorMain();
    }

    private Collection getCollection() {
        /**
         * 每个子类都对应不同的具体业务类型，使用父类作为参数，传递不同的子类完成不同的业务逻辑，非常完美
         * 说白了，什么是里氏替换原则，就是父类出现的地方，都可以用子类来替换实现，只要是父类出现，就可以用子类来完成
         *有以下四点必选实现：1子类必须完全实现父类的方法；2、子类可以有自己的个性；3.覆盖或实现父类方法时，输入参数可以放大
         * 4、复写或实现父类方法时，输出结果可以被缩小；
         * 子类和父类是一个矛盾的综合体，即相互冲突，又相互包容，是两个不可或缺的内容点
         * 依赖倒置原则，是一个非常重要的原则：怎么重要那，说白了就是说高层业务不依赖与底层模块；具体逻辑依赖于抽象，抽象不应该依赖于具体实现
         *1、模块间依赖通过抽象发生，实现类之间不发生直接的依赖挂系，其依赖关系是通过接口类或抽象实现的；
         * 2、接口或抽象类不依赖于实现类；
         * 3、实现类依赖接口或抽象类
         *依赖倒置原则的本质就是通过抽象（抽象类或接口）使各个类和模块实现彼此之间的独立，不相互影响，实现模块间的松耦合：
         * 1、在开发中如何实现，每个类中至少有抽象类或接口，有了抽象才可以依赖倒置；
         * 2、变量的表面类型，尽量是接口或抽象类；
         * 接口隔离原则：
         * 1、一个接口只服务于一个子模块或业务逻辑；
         * 2、通过业务逻辑压缩接口中的public 方法，经常回顾接口，实现接口达到“满身筋骨肉”，而不是“肥嘟嘟”的一大堆方法；
         * 3、已经被污染了的接口，尽量去修改，若变更的风险较大，则采用适配器模式进行转化处理；
         * 4、了解环境，拒绝盲从。每个项目或产品，都有特定的环境因素，环境不同，接口的拆分规则不同，
         * 设计模式之禅，非常难于理解的一本书，但是貌似有各种各样能助力进步的内容和说法，
         * 读的代码越多，对程序的理解就越多，进步发生在每一个不想发生的位置
         * 6、一个软件实体如类，模块和函数，应该对扩展开放，对修改关闭：
         * 具体解析：一个软件实体应该通过扩展来实现变化，而不是通过已有代码来实现变化，
         * int 型数据通过*100 或除100来实现通过精度变化导致的误差
         *5、迪米特原则（最少知识原则（least Knowledge Principle(LKP)））,
         * 朋友类的定义，出现在成员变量，方法的输入输出参数中的类称为成员朋友类，而出现在方法体内部的类，不属于朋友类，
         */
        return null;
    }


}
