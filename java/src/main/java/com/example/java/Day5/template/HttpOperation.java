package com.example.java.Day5.template;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */

/**
 * 1.私有化所有构造方法 不让外部自己去创建对象
 * 2.给外部提供一个方法（必须是静态方法）获取当前类的一个对象
 * 3.必须定义一个静态成员变量来保存当前类唯一的一个对象
 * 4.创建对象
 *      饿汉式：在定义静态成员变量时，直接创建当前类的一个对象，进行赋值
 *      懒汉式：默认不创建，当调用的时候才会创建
 */
public class HttpOperation  {

    //定义一个静态成员变量，保存对象instance
    private static HttpOperation instance;

    //提供一个静态方法
    private HttpOperation(){

    }

    //饿汉式
    //private static HttpOperation instance = new HttpOperation();

    //懒汉式
    public static HttpOperation getInstane(){
        //判断对象是否有值
        if (instance == null){
            //加锁
            synchronized (HttpOperation.class){
                if (instance == null){
                    //创建一个对象
                    instance = new HttpOperation();
                }
            }
        }
        return instance;
    }
}
