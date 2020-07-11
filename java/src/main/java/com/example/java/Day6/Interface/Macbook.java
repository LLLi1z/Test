package com.example.java.Day6.Interface;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */

import org.omg.CORBA.DATA_CONVERSION;

/**
 * 苹果电脑 需要外部设备进行数据交互 必须实现数据交互的接口
 */
public class Macbook implements DataInteraction.Input {
    @Override
    public void input() {
        System.out.println("打印机从电脑接受到数据");
    }
    
    public void printf(){
        System.out.println("打印机开始打印数据");
    }
}
