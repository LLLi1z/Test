package com.example.java.Poker_Game_final_version;

import java.util.Random;

/**
 * @Description：生成玩家名字
 * @Author 李易钊
 * @QQ 3435223264
 */
public class Util {
    public static String autoGenerateName(){
        Random random = new Random();
        //姓名的随机数
        int f_index = Math.abs(random.nextInt() % Constants.IPlayerName.NAMES_XING.length) ;
        int m_index = Math.abs(random.nextInt() % Constants.IPlayerName.NAMES_MING_M.length);
        int l_index = Math.abs(random.nextInt() % Constants.IPlayerName.NAMES_MING_L.length);

        String f = Constants.IPlayerName.NAMES_XING[f_index];
        String m = Constants.IPlayerName.NAMES_MING_M[m_index];
        String l = Constants.IPlayerName.NAMES_MING_L[l_index];

        return f + m + l;
    }
}
