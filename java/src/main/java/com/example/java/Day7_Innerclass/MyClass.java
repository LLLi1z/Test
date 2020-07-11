package com.example.java.Day7_Innerclass;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */

/**
 * 匿名对象：
 * 匿名类：
 *  匿名内部类不能申明构造方法
 *  使用匿名内部类必须满足：这个类要么继承某个父类，要么实现某个接口
 */
class Farmer{
    private String name;

    public Farmer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class MiniFarmer extends Farmer{

    public MiniFarmer(String name) {
        super(name);
    }
}
public class MyClass {
    public static void main(String[] args) {
//        //使用内部类
//        Car bz = new Car();
//        Car.Engine engine = bz.new Engine();
//        Car.Engine engine = new Car.Engine();
        //显示创建、显示对象
        //如果需要多次使用这个对象
        Farmer xw = new Farmer("小王");
        buildHouse(xw);
        xw.setName("小王plus");

        //匿名对象
        //这个对象只需要使用一次
        buildHouse(new Farmer("张三"));

        /*
        MiniFarmer miniFarmer = new MiniFarmer("小农民");
        buildHouse(miniFarmer);

        buildHouse(new MiniFarmer("小农民"));
         */

        //匿名类
        //不显示创建这个类
        buildHouse(new Farmer("miniFarmer"){
            //匿名类的具体实现
            public int salary;

            public void showMoney(){
                System.out.println(getName() + "的工钱为" + salary);
            }
        });

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

    }

    public static void buildHouse(Farmer f){
        System.out.println(f.getName() + "开始工作！");
    }
}
