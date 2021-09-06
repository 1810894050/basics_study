package com.classTest;

import org.junit.Test;

/**
 * Author:zhou-study
 * Other: 2021/9/1 - 17:37
 *
 * 抽象类不能被实例化。抽象类是用来被继承的，抽象类的子类必须重
 * 写父类的抽象方法，并提供方法体。若没有重写全部的抽象方法，仍
 * 为抽象类。
 *
 * 不能用abstract修饰变量、代码块、构造器
 * 不能用abstract修饰私有方法、静态方法、final的方法、final的类
 *
 */
public class AbstractTest {

    abstract class A{
        abstract void m1();
        public void m2(){
            System.out.println("A类中定义了m2方法！");
        }
    }

    class B extends A{
        void m1(){
            System.out.println("B类中定义了m1方法！");
        }
    }


    abstract class Template{
        public final void getTime(){
            long start = System.currentTimeMillis();
            code();
            long end = System.currentTimeMillis();
            System.out.println("执行时间是："+(end-start));
        }
        public abstract void code();
    }

    class SubTemplate extends Template{
        public void code(){
            for (int i=0;i<10000;i++){
                System.out.println(i);
            }
        }
    }


    @Test
    public void test(){
//        A a = new B();
//        a.m1();
//        a.m2();
        Template template = new Template(){
            @Override
            public void code() {
                for (int i =0;i<10000;i++){
                    System.out.println(i);
                }
            }
        };
        template.getTime();

    }

}
