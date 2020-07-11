package com.example.java.Poker;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public class MyClass {
    public static void main(String[] args) {
        //创建管理器
        PokerManager manager = new PokerManager();
        //生成一副牌
        manager.generateOnePackOfCard();
        //洗牌
        manager.shuffle();
        //显示
        manager.show();
    }
    public void test(){
        /*
        //创建一张牌
        Poker p1 = new Poker();
        p1.dot = "A";
        p1.pic = "♣";
        System.out.println(p1.dot + p1.pic);

        {
            System.out.println("jack");
            int a = 10;
            float b = 20;
            // 自动将整数转化为字符串
            // a = 10
            // b = 20
            // println 自动换行
            // print 不换行
            System.out.println("a = " + a);
        }

        {
            //java的数组
            //数组定义 Array
            //数组一旦创建，内存空间确定，无法变化
            int num[] = new int[30];
            //访问
            num[0] = 20;
            num[1] = 30;
            //获取数组的个数
            System.out.println("数组个数： " + num.length);

            //静态数组
            String name[] = new String[]{"jack","merry","rose"};

            //常用定义方式
            String[] titles = new String[]{"热点","体育","新闻"};
            //如何遍历一个数组
            for (int i = 0; i < titles.length; i++) {
                System.out.println(titles[i]);
                }

            //增强for循环（只关心你得到的，不关心是第几个）
            for (String temp : titles){
                System.out.println(temp);
            }
        }

        {
            //生成一副牌
            //准备一个数组保存所有的点数
            String[] dots = new String[]{
                    "2","3","4","5","6",
                    "7","8","9","10","J",
                    "Q","K","A"
                    };

            //保存所有的花色
            String[] pics = new String[]{"♠","♥","♣","♦"};

            //保存所有的扑克牌
            Poker[] pokers = new Poker[52];

            int index = 0;//记录存到第几张扑克牌
            for(String dot : dots){
                for (String pic : pics){
                    //创建一张扑克牌
                    Poker poker = new Poker();
                    poker.dot = dot;
                    poker.pic = pic;
                    pokers[index] = poker;
                    index++;
                }
            }

            //输出一副牌
            for (Poker poker : pokers){
                System.out.print(poker.dot + poker.pic + " ");
            }
        }
    }
         */
    }
}
