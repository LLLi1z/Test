package com.example.java.Day4;

import java.applet.AudioClip;
import java.lang.reflect.AnnotatedElement;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class MyClass {
    public static void main(String[] args) {
        Audi ad = new Audi(4, "时尚");
        System.out.println("ad的轮胎有" + ad.wheels + "个，" + "ad的感觉是：" + ad.feeling);
        ad.drive();

        Person p = new Person();
        BMW bmw = new BMW(4);
        Audi audi = new Audi(4,"ddd");
        p.goToWork(bmw);
        p.goToWork(audi);
    }
}
