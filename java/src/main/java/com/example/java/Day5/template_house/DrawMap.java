package com.example.java.Day5.template_house;

/**
 * @Description
 * @Author 李易钊
 * @QQ 3435223264
 */
public abstract class DrawMap {
    public void buildHouse(){
        //造什么方法
        String type = getHouseType();
        //选择颜色
        String color = getHouseColor();
        //材料
        String material = getMaterial();

        System.out.println("即将使用" + material + "造一个" + color + "的" + type);
    }

    public abstract String getHouseType();
    public abstract String getHouseColor();
    public abstract String getMaterial();
}
