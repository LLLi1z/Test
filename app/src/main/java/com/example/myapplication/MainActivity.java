package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    // 准备候选人
    String[] names = new String[]{"谢静","刘金豪","刘灿","林茂","李易钊","刘旭泽","秦雪梅"};
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {
        // 将View转化为Button
        Button btn = (Button)view;
        // 获取当前的标题
        String title = btn.getText().toString();
        // 判断按钮的标题
        if(title.equals("开始抽奖")){
            // 设置为暂停
            btn.setText("暂停");
            // 创建定时器
            timer = new Timer();
            // 每隔一段时间去执行一个任务
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    produceOnePeople();
                }
            },0,100);
        }else{
            // 设置为抽奖
            btn.setText("开始抽奖");
            // 关闭定时器
            timer.cancel();
        }
    }

    //产生一个随机人名，显示到文件控件上
    public void produceOnePeople(){
        // 产生一个随机数
        Random random = new Random();
        int index = Math.abs(random.nextInt()) & names.length;
        // 从数组里面取出这个名字
        String name = names[index];
        // 将名字显示到文本框
        TextView tv = findViewById(R.id.tv_name);
        tv.setText(name);
    }
}

