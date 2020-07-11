package com.example.java.Poker_Game_final_version.Poker;

/**
 * @Description：扑克类
 * @Author 李易钊
 * @QQ 3435223264
 */

/**
 *  2 3 4 5 6 7 8 9 10 J O K A
 */
public class Poker {
    public PicType type;
    protected String dot; //牌的点数
    protected PicType picType; //花色对象

    public Poker(String dot, PicType type) {
        this.dot = dot;
        this.type = type;
    }

    public static class PicType{
        public String pic; //花色
        public int tag; //花色对应的tag值

        public static final PicType SPADE = new PicType("♠",4);
        public static final PicType HEARTS = new PicType("♥",3);
        public static final PicType CLUBS = new PicType("♣",2);
        public static final PicType DIAMONDS = new PicType("♦",1);
        public PicType(String pic, int tag) {
            this.pic = pic;
            this.tag = tag;
        }
    }

    @Override
    public String toString() {
        return dot + type.pic;
    }
}
