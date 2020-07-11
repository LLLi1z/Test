package com.example.java.Day2;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */

/**
 * 构造方法：如何去创建一个对象
 * 系统默认提供一个无参数的构造方法
 *
 * 特点
 *  方法名和类名相同
 *  没有返回值
 *
 * 解决两个问题
 *  让代码更简洁
 *  在数据使用时能保证有数据
 */
public class Car {
    public int wheelCount;
    public int engine;
    public int seat;


    public Car(){

    }

    public Car(int count, int cEngine, int cSeat){
        wheelCount = count;
        engine = cEngine;
        seat = cSeat;
    }

    public void test(){
        System.out.println("engine count:" + engine);
    }
}
