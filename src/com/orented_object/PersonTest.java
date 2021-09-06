package com.orented_object;

import org.junit.Test;

/**
 * Author:zhou-study
 * Other: 2021/8/27 - 21:20
 */

/*
对象的多态性：
    父类的引用指向子类的对象

 多态的使用：
    当调用子父类同名同参的方法时，实际是执行子类重写父类的方法。——虚拟方法调用。
 特点：编译时，看左边；运行时，看右边。
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 =new Person();
        p1.eat();
        p1.doing();

        System.out.println("-----------------------------");
        Person p2 = new Man();
        p2.eat();
        p2.doing();

    }

    @Test
    public void test(){
        Person person = new Man();
        person.name="zhangsan";
    }

}

