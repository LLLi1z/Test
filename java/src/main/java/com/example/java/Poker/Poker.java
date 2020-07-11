package com.example.java.Poker;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */

/**
 *  2 3 4 5 6 7 8 9 10 J Q K A
 *  2♠ 2♥ 2♣ 2♦
 */
public class Poker {
    private String dot; //记录点数
    private String pic; //记录花色

    //提供构造方法
    public Poker(String dot, String pic) {
        this.dot = dot;
        this.pic = pic;
    }

    //set和get方法（外部使用）
    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    //重写toString方法（便于调试）
    @Override
    public String toString() {
        return dot + pic;
    }
}
