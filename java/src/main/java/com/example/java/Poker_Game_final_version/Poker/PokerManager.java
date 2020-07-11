package com.example.java.Poker_Game_final_version.Poker;

import com.example.java.Poker_Game_final_version.Constants;
import com.example.java.Poker_Game_final_version.game.IGameInitListener;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Description：扑克管理器
 * @Author 李易钊
 * @QQ 3435223264
 */
public class PokerManager {
    private IGameInitListener listener;
    private ArrayList<Poker> pokers;
    //提供单例对象
    private static PokerManager manager;
    //私有化构造方法
    private PokerManager(){

    }
    //提供一个公共的static PokerManager getManager方法
    public static PokerManager getManager(){
        if (manager == null){
            synchronized (PokerManager.class){
                if (manager == null){
                    manager = new PokerManager ();
                }
            }
        }
        return manager;
    }


    public void initPoker(){
        //初始化数组对象
        pokers = new ArrayList<>();

        //创建扑克牌
        for (String dot: Constants.IPoker.DOTS){
            for (Poker.PicType type: Constants.IPoker.PIC_TYPES){
                //创建一张牌
                Poker poker = new Poker(dot,type);
                //添加到数组中保存
                pokers.add(poker);
            }
        }
        //打乱顺序——洗牌
        Collections.shuffle(pokers);
        System.out.println(pokers);

        //当扑克牌初始化成功 就回调成功的事件给监听者（游戏中心）
        if (listener != null){
            listener.onInitSuccess();
        }
    }

    /**
     * 获取一张牌，然后从数组中将这张牌删掉
     * @return
     */
    public Poker getOnePoker(){
        if (pokers.size() > 0){
            //返回第一张牌
            Poker poker = pokers.get(0);

            //将这张牌从数组中删除
            pokers.remove(0);

            return poker;
        }
        return null;
    }

    public void setListener(IGameInitListener listener) {
        this.listener = listener;
    }
}
