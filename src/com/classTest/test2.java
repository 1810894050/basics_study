package com.classTest;

import org.junit.Test;

/**
 * Author:zhou-study
 * Other: 2021/8/16 - 15:33
 */
public class test2 {

    @Test
    public void test1() throws ClassNotFoundException {
        //String name ="zhangsan";

        //1.获取一个系统类加载器
//        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
//        System.out.println(classLoader);

        //2.获取系统类加载器的父类加载器，即扩展类加载器
//        classLoader = classLoader.getParent();
//        System.out.println(classLoader);

        //3.获取扩展类加载器的父类加载器，即引导类加载器
//        classLoader = classLoader.getParent();
//        System.out.println(classLoader);

        //4.测试当前类由哪个类加载器进行加载
//       ClassLoader classLoader1 = Class.forName(name).getClassLoader();
//       System.out.println(classLoader1);

       /* classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);*/

        char[] arr = new char[] { 'a', 'b', 'c' };
        System.out.println(arr);//abc
        int[] arr1 = new int[] { 1, 2, 3 };
        System.out.println(arr1);//[I@50134894
        double[] arr2 = new double[] { 1.1, 2.2, 3.3 };
        System.out.println(arr2);//[D@2957fcb0

    }
}
