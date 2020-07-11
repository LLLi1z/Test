package com.example.java.Day6.callback;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class Http {

    //1.定义一个接口 统一返回数据的方式
    public interface OnHttpFinishListener{
        void onSuccess(String img);
        void onFailure(String err);
    }

    //2.定义一个变量接收谁来监听网络下载完毕的事件
    private OnHttpFinishListener listener;

    public void getData(String url){
        System.out.println("开始下载...");
        System.out.println("图片下载完毕...");

        //3.任务结束 回调数据
        if (listener != null)
            listener.onSuccess("张柏芝和冠希哥的图片下载成功");
        else
            listener.onFailure("下载失败");
    }

    //4.提供set方法保存当前的监听者
    public void setListener(OnHttpFinishListener listener){
        this.listener = listener;
    }
}
