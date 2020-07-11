package com.example.java.Day6.Interface;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class Mouse implements DataInteraction.Output{
    @Override
    public void output() {
        System.out.println("鼠标输入坐标位置：东经38 北纬20");
    }
}
