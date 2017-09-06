package com.eascs.testdesignpattern.agency;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Create By chao.wang on 2017/9/4 11:13
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：中介者与观察者，有相似的性质，中介者是定向的，而观察者，是广播的，可以用广播来实现中介者模式的
 * 让复杂的操作，用观察者来做
 * <p>
 * 更改记录：
 */
public class AgencyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**

         * 当一个东西状态变化，通用的相互沟通的方式，非常大的一个框架，一个消息，额可以对其他对象发送消息，具体的对象给中介者发送对象，
         * 比如说，要有名名字，具体区分具体是那个对象
         * 一个名字，一个数字标注的，getMsg，有消息了，回去hashmap里去找，状态为0的消息，就要去做响应的动作，
         * 有点类似MCP,结构，最重要的部分，都是用ｐ来处理的，非常符合
         *
         *
         *
         * 中介者：用一个中介对象，封装一系列的对象交互；中介者使各对象不需要显示地相互作用，从而使其耦合松散，而且可以独立地改变他们之间的交互）
         *中介者的有点就是减少依赖，把1对多的依赖，编程1对1 的依赖，同事类中只依赖中介者，减少了依赖，当然同时也降低了，类间的耦合
         *
         * 中介者模式的缺点：中介者本身会膨胀的很大，而且逻辑复杂，同事类越多，中介者越复杂
         *
         */
    }
}