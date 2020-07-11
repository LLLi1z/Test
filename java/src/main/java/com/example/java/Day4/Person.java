package com.example.java.Day4;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */

/**
 * 编译和运行时是两个东西 不同对象
 * 什么时候使用多态：编译和运行时是有继承关系的（BMW,Audi -> Car）
 * 只能子类对象传给父类对象；不能父类对象传给子类对象或者同级
 * 子类可以向父类转换
 *
 * 在使用的时候，如果需要使用子类的方法或者属性，必须强制转换为对应的子类对象
 * instanceof：判断某个对象是不是某个类的对象
 */
public class Person {
    public void goToWork(Car car){
        car.drive();

        //判断某个类是不是一个类
        if (car instanceof BMW){
            BMW bmw = (BMW)car;
            bmw.testBWM();
        }

        if (car instanceof Audi){
            Audi audi = (Audi)car;
            audi.testAudi();
        }
    }
//    public void goToWork(Audi audi){
//        audi.drive();
//    }
//
//    public void goToWork(BMW bmw){
//        bmw.drive();
//    }
}
