package com.stringtest;

import org.junit.Test;

public class Strign_Study1 {

    @Test
    public void test1(){
        String s1="adb";
        String s2="adb";

        System.out.println(s1==s2); //true
//        s1="hello";

        System.out.println(s1);
        System.out.println(s2);
    }

    /*
    String的实例化方式
    方式一：通过字面量定义的方式
    方法二：通过new+构造器的方法

     */
    @Test
    public void test2(){
        String s1 = "test";
        String s2 = "test";

        //此时的s3和s4保存的地址值，是数据在堆空间中开辟空间以后的地址值
        String s3 = new String("test");
        String s4 = new String("test");

        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s1==s4);//false
        System.out.println(s3==s4);//false

        System.out.println("*********************");
        Person p1 = new Person("tome", 12);
        Person p2 = new Person("tome", 12);
        System.out.println(p1.name==p2.name);

    }

}
