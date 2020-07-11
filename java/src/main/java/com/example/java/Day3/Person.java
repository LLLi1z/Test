package com.example.java.Day3;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */

/**
 * setter/getter方法：***间接访问private修饰的成员变量***
 * Windows直接Help搜索Getter and Setter(选择要生成Getter和Setter的字段)/Constructor(快速提供构造方法)
 * setter/getter方法放在最后面（方便代码阅读）
 * public
 * protected
 * private
 */
public class Person {
    private String name;
    private  String addr;
    public int money;
    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    //当使用print输出一个对象时 就会去这个对象内部查找toStrong方法
    //如果没有实现name 那么会从父类Object里面去查找toString的实现
    //Object里面默认使用 类名@hashCode
    //重写toString方法是为了在调试的时候快速获取这个对象的信息
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", money=" + money +
                '}';
    }
//    public void setName(String name){
//        if(name.length() == 8){
//            this.name = name;
//        }
//    }
//    public String getName(){
//        //return this.name
//        return name;
//    }
}
