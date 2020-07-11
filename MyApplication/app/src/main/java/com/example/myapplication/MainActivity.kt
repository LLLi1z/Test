package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    
    private fun login(){
        //登陆功能
    }

    private fun loadData(){
        //网络获取数据
    }

    private fun upData(){
        //上传数据
    }
}