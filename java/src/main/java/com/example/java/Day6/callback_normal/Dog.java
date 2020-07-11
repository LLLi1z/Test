package com.example.java.Day6.callback_normal;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class Dog {
    public void wangwang(){
        //找中介
        Agent zs = new Agent();
        //告诉他结果返回给谁（谁接收返回的数据）
        zs.setKeji(this);
        //开始找房
        zs.rentHouse();
    }
    
    public void callBackUsePhone(){
        System.out.println("wangwangwang");
    }
}
