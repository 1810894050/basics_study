package com.classTest;

import org.junit.Test;

/**
 * Author:zhou-study
 * Other: 2021/9/1 - 16:56
 */
public class Circle_Static_Test {
    @Test
    public void testCircle(){
        Circle circle1 = new Circle(2.0);
        Circle circle2 = new Circle(3.0);

        circle1.display();
        circle2.display();

        double c = circle1.findArea();
        System.out.println("circle1的面积是："+c);

        double d = circle2.findArea();
        System.out.println("circle2的面积是："+d);
    }
}
