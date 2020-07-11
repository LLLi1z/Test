package com.example.java.Day2;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */

/**
 * 属性
 * 方法
 * 类 -> 内部类
 * 静态代码块
 *
 * Java是面向对象的语言，一切皆对象 类，Java里面方法是不能独立存在的，只能在类里面声明
 * 类方法=静态方法
 * 对象方法=实例方法
 *
 * 区别：
 * 定义的区别：静态方法 使用static修饰
 *
 * 意义的区别：
 *  静态方法依附于这个类本身，比实例方法优先被加载，
 *  当这个类被加载到内存中，这个类就被加载了，而此时对象还不存在
 *  所以只能用这个类来调用静态方法
 *  对象方法依附于对象，必须创建这个类的一个对象，用对象来调用
 *
 *  static可以修饰一下内容
 *       -变量        静态变量
 *       -方法        静态方法
 *       -类（内部类）静态内部类
 *
 * Java参数传递机制：值传递（传递过去的是当前变量的一份拷贝）
 *
 * 可变参数 ... 数组
 *
 * 方法的重载：同一个类里面 方法名相同 参数一定不同
 * 方法的重载和 返回值 修饰符 没有关系
 *
 */
public class Person {

    //定义一个没有参数的实例方法
    public void eat(int a){
        a++;
    }

    public void eat(float b){

    }

    public void work(String tool, String dest){

    }

    public String test(){
        //做一定的操作
        return "result";
    }
    public static void test2(){

    }

    public void test3(Car car){
        car.wheelCount = 4;
    }

    //可变参数 参数的个数不一定
    //使用数组来接收
    //String ... agrs 等价于 String[] args;
    public void test4(String ... args){
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}


