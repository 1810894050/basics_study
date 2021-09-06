package com.orented_object;

import org.junit.Test;

/**
 * Author:zhou-study
 * Other: 2021/9/3 - 10:48
 */
public class InnerClass {
    class Outter{
        private int s;
        public class Inner{
            public void mb(){
                s=100;
                System.out.println("在内部类Inner中s="+s);
            }
        }
        public void ma(){
            Inner i = new Inner();
            i.mb();
        }
    }

    public class Outer{
        private int s = 111;
        public class Inner{
            private int s = 222;
            public void mb(int s){
                System.out.println(s);//局部变量s
                System.out.println(this.s);//内部类对象的属性s
                System.out.println(Outer.this.s);//外部类对象属性s
            }
        }
    }

    public InnerClass(){
        Inner s1= new Inner();
        s1.a = 10;
        Inner s2= new Inner();
        s2.a = 20;
        InnerClass.Inner s3 = new InnerClass.Inner();
        System.out.println(s3.a);

    }

    class Inner{
        public int a=5;
    }

    @Test
    public void test(){
        //类Outter
//        Outter o = new Outter();
//        o.ma();

        //类Outer
//        Outer a = new Outer();
//        Outer.Inner b =a.new Inner();
//        b.mb(333);

        //类InnerClass
        InnerClass ic = new InnerClass();
        Inner r = ic.new Inner();
        System.out.println(r.a);//输出结果：5 5 5·
    }
}
