package com.eascs.testdesignpattern.status;

/**
 * Create By chao.wang on 2017/10/31 15:46
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 * 1.1 添加状态标识符
 */
public interface ILift {
    public final static int OPEN = 1;
    public final static int CLOSE = 1;
    public final static int RUN = 1;
    public final static int STOP = 1;

    public void setStatus(int status);

    public void open();

    public void close();

    public void run();

    public void stop();
}
