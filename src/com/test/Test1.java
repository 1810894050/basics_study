package com.test;

import java.lang.reflect.Method;
import java.util.concurrent.ForkJoinPool;

public class Test1 {
    public static void main(String[] args) {
     /*   int[] arr=new int[]{2,3,3,34,56,34};

        for(int i=0;i<=arr.length-1;i++){
            arr[i]=arr[i]/arr[0];
            System.out.println(arr[i]);
        }
    }*/
        Object t = true ? new Integer(1) : new Double(2.0);
        System.out.println(t);

        Object o2;
        if (true)
            o2 = new Integer(1);
        else
            o2 = new Double(2.0);
        System.out.println(o2);

        method1();

    }



    public static void method1() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//
    }

}