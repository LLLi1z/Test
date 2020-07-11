package com.example.java.Day1_类和对象_生成一副扑克牌;

import com.example.java.Day1_类和对象_生成一副扑克牌.Student;

public class MyClass {
    public static void main(String[] args) {

        /**
         * 对象创建=类的实例化
         * new 表示创建一个对象
         * Student() 这个类提供的构造方法，任何一个类都有一个默认的构造方法
         *      人：生下来
         *      恐龙：下蛋 -> 破壳而出
         *      蝌蚪：卵 -> 孵化
         *
         * 动态分配内存 malloc calloc realloc ->
         * 栈：系统分配 系统自动收回
         *
         * Java有垃圾自动回收机制
         *
         * 指针和引用的关系：
         *      指针变量保存的是地址
         *      引用和指针是同一个东西，java为了让大家编程更轻松，对指针进行封装 -> 引用
         *      不会看到各种*
         *
         * 在java编程时，尽量不要用指针的方式去理解，用对象来代替
         */
        int a = 10;
        int b = a;

        String name = new String();
        Student xw = new Student();
        Student gblw = xw;

        //给对象的属性赋值
        Student zs = new Student();
        zs.name = "张三";
    }
}
