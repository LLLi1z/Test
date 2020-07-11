package com.example.java.Day5.template;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */

/**
 * 模板里面定义执行的过程（有些功能自己可以实现 有些必须子类实现）
 *      抽象类使用abstract修饰
 *      抽象类不能被实例化
 *      抽象类里面可以定义成员变量|方法
 *          抽象方法必须使用abstract修饰
 *          而且不能被实现，只能在子类中实现
 *      子类继承于抽象类
 *          子类实现抽象类里面的抽象方法
 *          如果不想实现，可以将自己也变成抽象类
 *
 * 抽象类和普通类的区别：
 *      抽象类不能实例化，普通类可以
 *      抽象类里面可以有抽象方法（只申明 不实现），普通类不行
 */
public abstract class Activity {
    private String className;

    public Activity(){
        //子类必须实现的方法
        onCreate();

        //可以选择实现的方法
        onStart();
        onResume();
        onPause();
        onStop();
        onDestroy();
    }

    //界面布局
    public abstract void onCreate();
    //开始启动
    public void onStart(){

    }
    //界面显示出来了 可以交互了
    public void onResume(){

    }
    //暂停
    public void onPause(){

    }
    //已经停止
    public void onStop(){

    }
    //销毁
    public void onDestroy(){

    }
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
