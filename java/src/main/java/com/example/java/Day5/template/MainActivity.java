package com.example.java.Day5.template;

import com.example.java.Day5.template.Activity;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class MainActivity extends Activity {
    //抽象方法必须实现
    @Override
    public void onCreate() {
        System.out.println("创建首页的界面");
    }

    //子类可以重写父类的方法
    @Override
    public void onResume() {
        System.out.println("界面启动了，开始交互");
    }
}
