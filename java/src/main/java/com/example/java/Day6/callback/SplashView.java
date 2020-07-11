package com.example.java.Day6.callback;

import com.sun.net.httpserver.HttpHandler;

import java.awt.event.HierarchyBoundsListener;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */

//使用者必须实现这个接口
public class SplashView implements Http.OnHttpFinishListener {
    public SplashView(){
        //开始下载数据
        Http http = new Http();
        //6.必须传递当前对象给功能类
        http.setListener(this);
        //7.调用功能类 完成功能
        http.getData("www.baidu.com");
    }

    //5.必须实现接口内部的的所有抽象方法
    @Override
    public void onSuccess(String img) {
        System.out.println("展示图片：" + img);
    }

    @Override
    public void onFailure(String err) {
        System.out.println("下载失败：" + err);
    }
}
