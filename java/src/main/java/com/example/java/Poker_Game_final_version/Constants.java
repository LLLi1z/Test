package com.example.java.Poker_Game_final_version;

import com.example.java.Poker_Game_final_version.Poker.Poker;

/**
 * @Description：常量
 * @Author 李易钊
 * @QQ 3435223264
 */
public interface Constants {

    interface IPlayer{
        int CHAPS = 1000; //筹码
    }
    interface IPlayerName{
        String[] NAMES_XING = {"王","李","张"};
        String[] NAMES_MING_M = {"红","涛","国","东","建","强"};
        String[] NAMES_MING_L = {"高","潇","博","督","黎"};
    }
    interface IPlayerState{
        int HAND = 0; //还在玩
        int DISCARD = 1; //弃牌
    }
    /**
     * 扑克使用的常量
     */
    interface IPoker{
        //点数
        String[] DOTS = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        //四种花色
        Poker.PicType[] PIC_TYPES = {Poker.PicType.SPADE, Poker.PicType.HEARTS, Poker.PicType.CLUBS, Poker.PicType.DIAMONDS};

    }
}
