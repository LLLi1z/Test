package com.example.java.Day4;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class Car {
    public int wheels;
    public String color;
    public String brand;

    //Car类的构造方法
    public Car(int wheels){
        this.wheels = wheels;
        System.out.println("Car类 构造方法");
    }

    public Person drive(){
        System.out.println("汽车可以开");
        return null;
    }
}
