package com.example.java.Poker_Game_final_version.Player;

import com.example.java.Poker_Game_final_version.Constants;
import com.example.java.Poker_Game_final_version.Util;
import com.example.java.Poker_Game_final_version.game.IGameInitListener;

import java.util.ArrayList;

/**
 * @Description：玩家管理器
 * @Author 李易钊
 * @QQ 3435223264
 */
public class PlayerManager {
    private IGameInitListener listener;
    //实例单例对象
    private static PlayerManager manager;
    private ArrayList<Player> players;
    //私有化构造方法
    private PlayerManager(){

    }
    //提供一个公共的static PlayerManager getManager方法
    public static PlayerManager getManager(){
        if (manager == null){
            synchronized (PlayerManager.class){
                if (manager == null){
                    manager = new PlayerManager();
                }
            }
        }
        return manager;
    }

    /**
     * 初始化玩家
     * @param totalPlayer
     */
    public void initPlayer(int totalPlayer){
        //创建数组
        players = new ArrayList<>();

        for (int i = 0; i < totalPlayer; i++){
            //获取玩家名字
            String name = Util.autoGenerateName();
            System.out.println(name);
            //创建玩家对象
            Player player = new Player(i + 1,name,Constants.IPlayer.CHAPS);
            //保存玩家
            players.add(player);
        }
        //当扑克牌初始化成功 就回调成功的事件给监听者（游戏中心）
        if (listener != null){
            listener.onInitSuccess();
        }
    }

    /**
     * 所有玩家扣钱：打底注
     * @param count
     */
    public void deDuctMoney(int count){
        for (Player player: players){
            player.loseMoney(count);
        }
    }

    /**
     * 获取玩家人数
     * @return
     */
    public int getPlayerCount(){
        return players.size();
    }

    public Player getPlayer(int index){
        return players.get(index);
    }
    public void setListener(IGameInitListener listener) {
        this.listener = listener;
    }
}
