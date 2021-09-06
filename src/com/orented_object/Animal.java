package com.orented_object;

/**
 * Author:zhou-study
 * Other: 2021/8/30 - 10:33
 */
public class Animal {
    private int legs;

    //构造器
    //初始化legs的值
    public Animal(){
        legs = 4;
    }



    public void setLegs(int i){
        if (i !=0 && i!=2 && i!=4){
            System.out.println("错误的退数");
            return;
        }
        legs = i;
    }

    public int getLegs(){
        return legs;
    }

}

