package com.example.java.Day6.interface_reference;

import com.example.java.Poker.Constants;

import org.omg.CORBA.COMM_FAILURE;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */

class Father implements Communicate{

}

abstract class Cute{

}


interface Communicate{
    //接口无法实例化
}

class Child extends Father implements Communicate{

}

/**
 * 多态只能子类向父类转
 */

public class MyClass {
    public static void main(String[] args) {
        Child a = new Child();
        Father b = new Father();
        test1(a);
        test2(b);
        test3(a);
    }

    public static void test1(Child a){
        //使用的时候还是要转化为子类的对象 为了让接口更统一
        System.out.println("孩子是父亲的孩子");
    }

    public static void test2(Father b){
        System.out.println("父亲");
    }

    public static void test3(Communicate a){
        System.out.println("跟孩子交流");
    }
}
