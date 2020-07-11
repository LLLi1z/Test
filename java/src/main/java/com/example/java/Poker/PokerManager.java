package com.example.java.Poker;

import java.security.Policy;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class PokerManager {
    //保存一副牌
    private ArrayList<Poker> pokers;

    //实现构造方法
    public PokerManager(){
     //初始化数组
     pokers = new ArrayList<>();
    }

    //生成一副牌（扑克牌 麻将）
    public void generateOnePackOfCard(){
        for (int i = 0; i < Constants.POKRE_DOTS.length; i++) {
        //取出i对应的点数
            String dot = Constants.POKRE_DOTS[i];
            //为这个点数创建4种花色
            for (int j = 0; j < Constants.POKER_PICS.length; j++) {
                //取出j对应的花色
                String pic = Constants.POKER_PICS[j];
                //创建一张牌
                Poker poker = new Poker(dot,pic);
                //保存这张牌
                pokers.add(poker);
            }
        }
    }

    //洗牌
    public void shuffle(){
        // 1 2 3 4 5
        Collections.shuffle(pokers);
    }

    //显示一副牌
    public void show(){
        int index = 0;
        for (Poker poker : pokers){
            //使用print不自动换行
            System.out.print(poker);
            //使显示的时候每8张牌换一行
            if ((index + 1) % 8 == 0){
                System.out.println(" ");
            }
            index++;
        }
    }
}
