package com.example.java.Day5.template;

import com.example.java.Day5.template.Activity;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class QQZoneActivity extends Activity {
    @Override
    public void onCreate() {
        System.out.println("布局QQ空间的页面");
    }

    @Override
    public void onDestroy() {
        System.out.println("QQ界面销毁了 我得做点事情");
    }
}
