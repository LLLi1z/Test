package com.example.java.Day2;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class MyClass {
    public static void main(String[] args) {
//        Person p = new Person();
//        p.work("榔头","工地");
//        String result = p.test();
//        Person.test2();

        {
            int a = 10;
            Person p = new Person();
            p.eat(a);
            System.out.println("a = " + a);
        }

        {
            Car bz = new Car();
            bz.wheelCount = 8;

            Person p = new Person();
            p.test3(bz);

            System.out.println("wheel count is " + bz.wheelCount);
        }

        {
            Person p = new Person();
            p.test4("jack","rose","marry");
        }

        {
            Car c1 = new Car();
            c1.test();
            c1.engine = 3;

            Car c2 = new Car(3,2,7);
            c2.test();


            c1.wheelCount = 4;
            c1.engine = 2;
            c1.seat = 7;

            Car c = new Car(4,2,7);
        }
    }
}

