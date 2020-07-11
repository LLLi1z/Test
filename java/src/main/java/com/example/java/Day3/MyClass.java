package com.example.java.Day3;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class MyClass {
    public static void main(String[] args) {
        Person p = new Person();

        //直接访问
        p.money = 200;

        //间接访问
        p.setName("jack");

        System.out.println("I have " + p.money + " money");
        System.out.println("My name is " + p.getName());

        System.out.println(p);

    }
}
