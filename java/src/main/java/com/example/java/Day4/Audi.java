package com.example.java.Day4;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */

import java.util.ArrayList;

import javax.swing.UIManager;

/**
 * Java里面只能直接继承于一个类 (与只能继承一个类不同）
 * 父类、子类
 * 可以继承父类的属性和方法 但是不能继承父类的构造方法
 * super：表示调用父类的属性或者方法
 * super()：表示调用父类的构造方法
 * this：表示访问当前类或者对象的属性或者方法
 * 构造方法的执行顺序：父类 -> 子类B -> 子类C
 *
 * 子类不能继承父类private修饰的属性或者方法
 * 子类继承父类的方法（public protected修饰的方法）
 * 如果子类需要在父类的基础上实现父类的方法，子类必须重写这个方法
 * 这个过程称为重写或者覆盖
 * 如果子类重写了父类的方法，那么不会调用父类的方法
 * 如果没有重写，先从当前类查找这个方法，如果没有再去父类查找
 * 如果父类中都没有这个方法，就报错
 *
 * 重载：同一个类里面，方法名相同，参数不同
 * 重写：两同：方法名和参数相同；
 *      两小：子类的返回值必须比父类的要小或者相同/子类抛出的异常必须比父类抛出的小或者相同
 *      一大：子类的修饰符范围要比父类小或者相同
 *
 * 低耦合 高内聚
 * 优点：复用性更强
 * 缺点：耦合性大/安全性降低了
 *  1.尽量让父类属性的修饰符为private（子类无法继承）
 *  2.尽量让父类方法的修饰符为private或者final
 *  3.尽量不要在父类的构造方法里面调用可能被子类重写的方法
 */
public class Audi extends Car{
    public String feeling;

    //Audi继承了父类Car，父类构造方法中有参数的部分，子类也必须有
    //这里wheels就是Audi类必须有的属性
    public Audi(int wheels, String feeling) {
        super(wheels);
        this.feeling = feeling;
        System.out.println("Audi的构造方法");
    }

    @Override
    public Child drive() {
        System.out.println("开着Audi车10s上100");
        return null;
    }
    
    public void testAudi(){
        System.out.println("年轻人的梦想：开着奥迪去兜风");
    }
}
