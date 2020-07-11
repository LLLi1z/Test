package com.example.java.Poker_Game_final_version.game;

import com.example.java.Poker_Game_final_version.Player.Player;
import com.example.java.Poker_Game_final_version.Player.PlayerManager;
import com.example.java.Poker_Game_final_version.Poker.Poker;
import com.example.java.Poker_Game_final_version.Poker.PokerManager;

/**
 * @Description：扑克游戏中心
 * @Author 李易钊
 * @QQ 3435223264
 */
public class PokerGameCenter extends AGameCenter {
    private static PokerGameCenter instance;

    private PokerGameCenter(){

    }

    public static PokerGameCenter getInstance(){
        if (instance == null){
            synchronized (AGameCenter.class){
                if (instance == null){
                    instance = new PokerGameCenter();
                }
            }
        }
        return instance;
    }

    @Override
    protected void initGame() {
        //创建对象
        playerManager = PlayerManager.getManager();
        pokerManager = PokerManager.getManager();
        ante = 0;
        totalPlayer = 3;
        bottom = 5;

        //设置监听者
        playerManager.setListener(this);
        pokerManager.setListener(this);

        //初始化完毕 成功的计数器+1
        setTotalSuccess(getTotalSuccess() + 1);
    }

    @Override
    protected void initPoker() {
        pokerManager.initPoker();
    }

    @Override
    protected void initPlayer() {
        playerManager.initPlayer(totalPlayer);
    }

    @Override
    protected void start() {
        //先扣底注钱
        playerManager.deDuctMoney(bottom);

        //发牌
        dealCards();
    }

    /**
     * 发牌
     */
    private void dealCards(){
        int count = playerManager.getPlayerCount();
        for (int i = 0; i < count; i++){
            //从扑克中心获取一张牌
            Poker poker = pokerManager.getOnePoker();
            //将这张牌发给对应的人
            Player player = playerManager.getPlayer(i);
            player.poker = poker;
        }
    }
}