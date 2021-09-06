package com.orented_object;

/**
 * Author:zhou-study
 * Other: 2021/8/30 - 14:58
 */
public class Demo {
    //例题一、
//    public static void main(String[] args){
//        show(0);
//        show(1);
//    }
//    public static void show(int i){
//        switch(i){
//            default:
//                i+=2;
//            case 1:
//                i+=1;
//            case 4:
//                i+=8;
//            case 2:
//                i+=4;
//        }
//        System.out.println("i="+i);
//    }


    //例题二
//    public static void main(String[] args){
//        //private String s =""; 局部变量前不能添加访问修饰符（public、private、protected）
//        int x = 1;
//        for(show('a'); show('b') && x<3; show('c')){
//            show('d');
//            x++;
//        }
//    }
//    public static boolean show(char ch){
//        System.out.print(ch);
//        return true;
//    }
    //答案：abd cbd cb


    //例题三：
//    public static void leftshift(int i, int j){
//        i+=j;
//    }
//    public static void main(String args[]){
//        int i = 4, j = 2;
//        leftshift(i, j);
//        System.out.println(i);
//
//        //答案：4，和leftShift函数没关系。
//    }


    //例题4：
//    int i ;
//    void change(int i){
//        i++;
//        System.out.println(i);
//    }
//    void change1(Demo t){
//        t.i++;
//        System.out.println(t.i);
//    }
//    public static void main(String[] args) {
//        Demo ta = new Demo();
//        System.out.println(ta.i);
//        ta.change(ta.i);
//        System.out.println(ta.i);
//        ta.change1(ta);
//        System.out.println(ta.i);
//        //答案：0 1 0 1 1
//    }

    //例题5：
    public static void main(String argv[]) {
        Demo t = new Demo();
        t.first();
    }

    public void first() {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v, i);
        System.out.println(v.i);
    }

    public void second(Value v, int i) {
        i = 0;
        v.i = 20;
        Value val = new Value();
        v = val;
        System.out.print(v.i + " " + i);
    }
}
