package com.example.java.Poker_Game_final_version.Player;

import com.example.java.Poker_Game_final_version.Constants;
import com.example.java.Poker_Game_final_version.Poker.Poker;

import java.util.ArrayList;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class Player {
    public int id; //编号
    public String name; //名字
    public int chip; //筹码
    public Poker poker; //牌
    public ArrayList<Poker> pokers; //多张牌
    public int playerState; //玩家的状态

    public Player(int id, String name, int chip) {
        this.id = id;
        this.name = name;
        this.chip = chip;

        //初始化状态
        playerState = Constants.IPlayerState.HAND;
    }

    /**
     * 扣钱
     * @param count
     */
    public void loseMoney(int count){
        chip -= count;
    }

    @Override
    public String toString() {
        return "id:" + id + "name:" + name + " " + poker.type.tag + poker.type.pic;
    }
}
