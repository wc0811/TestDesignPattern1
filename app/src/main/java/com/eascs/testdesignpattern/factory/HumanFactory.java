package com.eascs.testdesignpattern.factory;

import android.util.Log;

/**
 * Create By chao.wang on 2017/10/17 16:43
 * <p>
 * email：wc0811@163.com
 * <p>
 * 类描述：
 * <p>
 * 更改记录：
 */
public class HumanFactory extends AbstractHumanFactory {
    private final String TAG = "HumanFactory";

    @Override
    public <T extends Human> T createHuman(Class<T> tClass) {
//        定义一个生产的人种
        Human human = null;
        try {
            human = (Human) Class.forName(tClass.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
            Log.v("HumanFactory", "生成人种失败");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            Log.v("HumanFactory", "生成人种失败");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            Log.v("HumanFactory", "生成人种失败");
        }
        return (T) human;
    }
}
