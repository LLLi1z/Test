package com.example.java.Day6.Interface;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */

/**
 * 使用interface表示定义一个接口
 * 接口也可以继承多个接口（多个接口之间用逗号隔开）
 * 接口内部元素
 *  1.接口不能被实例化（没有构造方法）
 *  2.定义变量（只能是静态成员变量）（默认修饰符public static final）
 *  3.方法
 *      抽象方法（常用）：不需要自己实现。谁用谁就实现（默认修饰符public abstract）
 *          使用implements实现接口
 *          必须实现接口里面定义的方法
 *       类方法、默认方法、私有方法：可以实现
 *  4.内部接口
 */

// 用这种方法替代枚举
interface Season{
    int SPRING = 1;
    int SUMMER = 2;
    int AUTOM = 3;
    int WINTER = 4;
}
interface  t2{

}
public interface DataInteraction {
    interface Input{
        void input();
    }

    interface Output{
        void output();
    }
}
