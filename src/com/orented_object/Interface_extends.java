package com.orented_object;

import org.junit.Test;

/**
 * Author:zhou-study
 * Other: 2021/9/3 - 9:31
 */
public class Interface_extends {

    interface Filial{//孝顺的
        default void help(){
            System.out.println("老妈我来就你了！");
        }
    }
    interface Spoony{//痴情的
        default void help(){
            System.out.println("老婆别怕，我来了！！");
        }
    }

    class Man implements Filial,Spoony{
        @Override
        public void help(){
            System.out.println("我该怎么办？？");
            Filial.super.help();
            Spoony.super.help();
        }
    }

    @Test
    public void test(){
        Man man = new Man();
        man.help();
    }

    //找错一
//    interface A{
//        int x = 0;
//    }
//
//    class B{
//        int x = 1;
//    }
//
//    class C extends B implements A{
//        public void px(){
//            System.out.println(x);
//        }
//
//        public static void main(String[] args) {
//            new C().px();
//        }
//    }

    //找错二
//    interface Playable{
//        void play();
//    }
//    interface Bounveable{
//        void play();
//    }
//
//    interface Rollable extends Playable,Bounveable{
//        Ball ball = new Ball("pingpang");//报错，因为Ball类不是静态
//    }
//
//    class Ball implements Rollable{
//        private String name;
//
//        public String getName() {
//            return name;
//        }
//
//        public Ball(String name) {
//            this.name = name;
//        }
//
//        public void play(){
//           Ball ball = new Ball("");
//            System.out.println(ball.getName());
//        }
//    }
}
