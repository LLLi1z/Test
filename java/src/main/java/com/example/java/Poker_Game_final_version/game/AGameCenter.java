package com.example.java.Poker_Game_final_version.game;

import com.example.java.Poker_Game_final_version.Player.PlayerManager;
import com.example.java.Poker_Game_final_version.Poker.PokerManager;

/**
 * @Description：抽象类模板--总游戏中心
 * @Author 李易钊
 * @QQ 3435223264
 */
public abstract class AGameCenter implements IGameInitListener {
    private int totalSuccess;
    protected PlayerManager playerManager;
    protected PokerManager pokerManager;
    protected int ante; //台面总金额
    protected int totalPlayer;
    protected int bottom;// 底注

    protected AGameCenter(){

        //初始化游戏本身的数据
        initGame();
        //初始化玩家
        initPlayer();
        //初始化扑克
        initPoker();
    }

    protected abstract void initGame();

    protected abstract void initPoker();

    protected abstract void initPlayer();

    protected abstract void start();

    @Override
    public void onInitFailure() {

    }

    @Override
    public void onInitSuccess() {
        //对成功的计数器+1
        setTotalSuccess(getTotalSuccess() + 1);
    }

    public void setTotalSuccess(int totalSuccess){
        this.totalSuccess = totalSuccess;
        if (totalSuccess == 3){
            start();
        }
    }

    public int getTotalSuccess() {
        return totalSuccess;
    }
}
