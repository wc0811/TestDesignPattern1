package com.eascs.testdesignpattern.interator;

import java.util.Vector;

/**
 * Create By chao.wang on 2017/10/23 17:10
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public class ConCreteInterator implements Interator {
    private Vector vector = new Vector();
    //    定义当前的游标
    private int iCursor = 0;

    public ConCreteInterator(Vector vector) {
        this.vector = vector;
    }

    @Override
    public Object next() {
        Object result = null;
        if (this.hasNext()) {
            result = (Object) this.vector.get(iCursor++);
        } else {
            result = null;
        }

        return result;
    }

    @Override
    public boolean hasNext() {
        if (iCursor == vector.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean remove() {
        this.vector.remove(this.iCursor);//两个操作，一个是删除当前元素，一个是游标指向下已元素
        return true;
    }
}
