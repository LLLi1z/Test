package com.example.java.Day6.callback_normal;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */

/**
 * 功能类来说
 *  1.每增加一个使用者 需要添加一个成员变量保存
 *      解决办法：使用多态 用接口类型的变量 接收所有子类类型
 *  2.写一个set方法设置对象
 *  3.判断并且调用这个对象的相应方法接收数据
 *
 * 使用者
 *  1.必须自己来定义一个方法类接收数据
 *      解决办法：定义接口，接口中规范接收的方式
 */
public class Agent {
    private Person fupo;
    private Dog keji;
    private Cat mCat;

    public void rentHouse(){
        System.out.println("我是中介：开始找房源");
        System.out.println("房子找到了！");
        //返回数据
        if (fupo != null){
            fupo.callBackUseQQ("你好");
        }
        if (keji != null){
            keji.callBackUsePhone();
        }
        if (mCat != null){
            mCat.callBackUseMsn();
        }
    }

    public void setFupo(Person fupo){
        this.fupo = fupo;
    }
    public void setKeji(Dog keji){
        this.keji = keji;
    }
    public void setmCat(Cat mCat){
        this.mCat = mCat;
    }
}
