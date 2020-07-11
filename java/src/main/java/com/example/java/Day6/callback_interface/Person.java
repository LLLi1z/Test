package com.example.java.Day6.callback_interface;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class Person implements Agent.OnAgentFinishListener{
    public void needOneHouse(){
        Agent xw = new Agent();
        xw.setListener(this);
        xw.rentHouse();
    }

    @Override
    public void onFinish(String des) {
        System.out.println("我是pxd 喜欢你的房子:" + des);
    }
}
