package com.example.java.Day6.callback_interface;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class Agent {
    private OnAgentFinishListener listener;

    public void setListener(OnAgentFinishListener listener) {
        this.listener = listener;
    }

    public void rentHouse(){
        System.out.println("我是中介：开始找房源");
        System.out.println("房子找到了！");
        //回调数据
        if (listener != null){
            listener.onFinish("四合院");
        }
    }

    public interface OnAgentFinishListener{
        void onFinish(String des);
    }
}
