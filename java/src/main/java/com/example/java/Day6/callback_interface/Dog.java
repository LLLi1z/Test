package com.example.java.Day6.callback_interface;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class Dog implements Agent.OnAgentFinishListener{
    public void wangwang(){
        Agent xw = new Agent();
        xw.setListener(this);
        xw.rentHouse();
    }

    @Override
    public void onFinish(String des) {
        System.out.println("我是旺财 房子太大了：四合院");
    }
}
