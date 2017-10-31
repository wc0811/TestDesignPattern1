package com.eascs.testdesignpattern.visitor;

import android.util.Log;

/**
 * Create By chao.wang on 2017/10/31 13:35
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：访问者模式，是对象对数据的处理
 * <p>
 * 更改记录：
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(CommonEmployee commonEmployee) {
        Log.i("CW", "访问普通员工，打印报表");
        getBasicInfo(commonEmployee);
    }

    @Override
    public void visit(Manager manager) {
        Log.i("CW", "访问中层员工，打印报表");
        getManagerInfo(manager);
    }

    private void getBasicInfo(Employee employee) {

        String strInfo = "";
        strInfo += "姓名：" + employee.getName() + "\r\n" +
                "薪水：" + employee.getSalay() + "\r\n" +
                "性别：" + (employee.getSex() == 1 ? "女" : "男");
//                + employee.getOterInfo();
        Log.i("CW", strInfo);

    }

    private void getManagerInfo(Manager manager) {

        String strInfo = "";
        strInfo += "姓名：" + manager.getName() + "\r\n" +
                "薪水：" + manager.getSalay() + "\r\n" +
                "性别：" + (manager.getSex() == 1 ? "女" : "男")
                + manager.getOterInfo();
        Log.i("CW", strInfo);

    }

    private void getCommonEmployeeInfo(CommonEmployee commonEmployee) {

        String strInfo = "";
        strInfo += "姓名：" + commonEmployee.getName() + "\r\n" +
                "薪水：" + commonEmployee.getSalay() + "\r\n" +
                "性别：" + (commonEmployee.getSex() == 1 ? "女" : "男");
//                + commonEmployee.getOterInfo();
        Log.i("CW", strInfo);

    }

}
