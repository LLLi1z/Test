package com.example.java.Day1_类和对象_生成一副扑克牌;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */

/**
 * public：修饰符，公共的，公开的 -> 外部可以访问这个类
 *         public修饰的类必须和文件名相同
 * private：私有的 -> 外部无法访问（不能使用）
 *
 * class：关键字 - 表示一个类
 *
 * Student： 类名（首字母大写）
 *
 * 同一文件里面可以声明多个类，但是只能有一个public类
 * 为了阅读性和更好的管理，通常只在一个文件里面声明一个类
 * 如果有多个类，通常会以内部类的方式存在
 *
 * 属性/成员变量：记录一些数据 Card(money,pwd)
 *
 * 默认使用protected修饰符：同一个包里面，可以访问对象的这个属性，外部无法直接访问
 * public：公开的  公共的，包的内部和外部可以访问这个属性
 * private：私有的，只有这个对象内部才能使用
 */
public class Student {
    public String name; //记录学生的名字
    protected String secret; //记录学生的秘密
    private int age; //记录学生的年龄
}