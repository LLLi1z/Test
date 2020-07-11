package com.example.java.Day7_Innerclass;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */

/**
 * 尽量一个文件定义一个类
 * 需要在类的内部定义一个类，这种类就成为内部类
 * 原因：希望封装对应的功能，这些功能可能不太希望直接暴露给外部
 * 内部类是外部类的一个成员
 *  内部类可以直接访问外部类的数据
 *  外部类无法直接调用内部类的数据
 *  内部类可以使用private public protected final 来修饰，外部类只能使用public来修饰
 * 普通内部类-属于对象，必须对象来调用
 *      Car bz = new Car();
 *      Car.Engine engine = bz.new Engine();
 * 静态内部类-属于类，必须类来调用，静态内部类无法调用非静态数据
 */
public class Car {
    private int wheels;

    public void start(){
        wheels = 4;
        //内部使用内部类
        Engine engine = new Engine();
    }
    public static class Engine{
        public int a;
        public Engine(){

        }
    }
}
