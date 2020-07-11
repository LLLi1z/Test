package com.example.java.Day6.callback_normal;

import java.lang.reflect.AnnotatedElement;

import javax.xml.ws.soap.AddressingFeature;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class Cat {
    public void miaomaio(){
        //找一个中介 完成租房功能
        Agent agent = new Agent();
        //告诉他是谁让他做的（告诉他有结果了返回给谁）
        agent.setmCat(this);
        //开始找房
        agent.rentHouse();
    }

    public void callBackUseMsn(){
        System.out.println("maiomiao");
    }
}
