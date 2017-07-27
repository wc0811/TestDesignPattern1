package com.eascs.testdesignpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Collection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getCollection();
    }

    private Collection getCollection() {
        /**
         * 每个子类都对应不同的具体业务类型，使用父类作为参数，传递不同的子类完成不同的业务逻辑，非常完美
         * 说白了，什么是历史替换原则，就是父类出现的地方，都可以用子类来替换实现，只要是父类出现，就可以用子类来完成
         *有以下四点必选实现：1子类必须完全实现父类的方法；2、子类可以有自己的个性；3.覆盖或实现父类方法时，输入参数可以放大
         * 4、复写或实现父类方法时，输出结果可以被缩小；
         * 子类和父类是一个矛盾的综合体，即相互冲突，又相互包容，是两个不可或缺的内容点
         */
        return null;
    }
}
