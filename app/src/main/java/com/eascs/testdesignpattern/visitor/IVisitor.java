package com.eascs.testdesignpattern.visitor;

import com.eascs.testdesignpattern.visitor.cmn.Element;

/**
 * Create By chao.wang on 2017/10/31 13:31
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：定一个访问者接口，目的就是访问对象完成指定的操作
 * 建造者是在模版模式的基础上定义工作的先后顺序
 * <p>
 * 更改记录：
 */
public interface IVisitor {
    public void visit(CommonEmployee commonEmployee);//可以访问那些对象

    public void visit(Manager manager);//可以访问那些对象

    public void visit(Element element);//可以访问那些对象
}
