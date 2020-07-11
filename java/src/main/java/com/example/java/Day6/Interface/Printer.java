package com.example.java.Day6.Interface;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class Printer implements DataInteraction.Input,DataInteraction.Output{

    @Override
    public void input() {
        System.out.println("打印机从电脑得到数据");
    }

    @Override
    public void output() {
        System.out.println("打印机开始打印");
    }
}
