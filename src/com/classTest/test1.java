package com.classTest;

/**
 * Author:zhou-study
 * Other: 2021/8/15 - 16:38
 */
public class test1 {
    public static void main(String[] args) {
       // System.out.println(A.m);
        //一、主动引用
//        B b = new B();
//        System.out.println(b.c);

        //二、被动引用
        B[] array=new B[5];
        System.out.println(B.c);
       //System.out.println(B.M);//不会初始化父类，输出B中M的值，
    }

    static {
        System.out.println("main所在的类");
    }
}

//class A{
//    static {
//         m = 300;
//    }
//    static int m = 100;
//}

class Father{
    static int b=2;
    static {
        System.out.println("父类的方法");
    }
}

class B extends Father{
    static{
        System.out.println("子类的方法");
        c = 300;
    }
    static int c=100;
    static final int M =1;
}