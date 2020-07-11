package com.example.java.Day6.callback_normal;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class Person {
    public void needOneHouse(){
        //找一个中介 完成租房功能
        Agent agent = new Agent();
        //告诉他是谁让他做到（告诉他有结果了返回给谁）
        agent.setFupo(this);
        //开始找房
        agent.rentHouse();
    }
    
    //自己定义一个接收的方法
    public void callBackUseQQ(String mag){
        System.out.println("辛苦了");
    }
}
