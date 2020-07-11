package com.example.java.Day5.template;

import com.example.java.Day5.Singlton.TestSinglton;
import com.example.java.Day5.template_house.Worker;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class MyClass {
    public static void main(String[] args) {
        Worker xw = new Worker();
        xw.buildHouse();
    }
    public void activity(){
        //创建一个抽象类
        MainActivity mActivity = new MainActivity();
        QQZoneActivity qqActivity = new QQZoneActivity();
    }
    public void singlton(){
        HttpOperation instance1 = HttpOperation.getInstane();
        HttpOperation instance2 = HttpOperation.getInstane();
        HttpOperation instance3 = HttpOperation.getInstane();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);

        TestSinglton ts1 = new TestSinglton();
        TestSinglton ts2 = new TestSinglton();
        TestSinglton ts3 = new TestSinglton();

        System.out.println(ts1);
        System.out.println(ts2);
        System.out.println(ts3);
    }
}
