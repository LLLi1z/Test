package com.example.java.Day4;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class BMW extends Car{
    public BMW(int wheels){
        super(wheels);
    }

    @Override
    public Person drive() {
        System.out.println("开着宝马车 舒适");
        return null;
    }
    
    public void testBWM(){
        System.out.println("开宝马独有的感觉：我有money");
    }
}
