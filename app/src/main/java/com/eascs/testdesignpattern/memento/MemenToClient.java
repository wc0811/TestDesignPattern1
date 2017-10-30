package com.eascs.testdesignpattern.memento;

/**
 * Create By chao.wang on 2017/10/30 13:36
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：定义：再不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样以后就可以将该对象恢复到原保存的状态
 * <p>
 * 更改记录：1.1 优化后的备忘录模式
 * 1.2 添加新的备忘录管理类
 *
 */
public class MemenToClient {
    public MemenToClient() {
//        Boy boy = new Boy();
//        boy.setState("Good");
//        Boy boyBack = new Boy();
//        boyBack.setState(boy.getState());
//        boy.changeState();
//        boy.setState(boyBack.getState());

//        Boy boy = new Boy();
//        boy.setState("Good");
//        Memento memento = boy.createMemento();
//        boy.changeState();
//        boy.restoreMemento(memento);
//        boy.getState();

        Boy boy = new Boy();
        boy.setState("Good");
        Cartaker cartaker = new Cartaker();
        cartaker.setMemento(boy.createMemento());
        boy.changeState();
        boy.restoreMemento(cartaker.getMemento());
        boy.getState();

    }
}
