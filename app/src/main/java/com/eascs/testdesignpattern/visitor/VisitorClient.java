package com.eascs.testdesignpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Create By chao.wang on 2017/10/31 11:43
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：设置访问者模式，对访问者模式简单了解
 * <p>
 * 更改记录：
 */
public class VisitorClient {
    public VisitorClient() {
        for (Employee item : getEmployeeInfo()) {
        }
    }

    private List<Employee> getEmployeeInfo() {
        List<Employee> list = new ArrayList<>();
        return list;
    }
}
