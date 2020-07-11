package com.example.java.Review;

import javax.swing.JFormattedTextField;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class 素数 {
    public static void main(String[] args) {
        int i, j;
        int index = 0;
        for (i = 100; i <= 1000; i++){
            for (j = 2; j <= i; j++){
                if (i % j == 0){
                    break;
                }
            }
            if (j >= i){
                index++;
            }
        }
        System.out.println(index);
    }
}
