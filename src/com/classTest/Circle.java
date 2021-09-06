package com.classTest;

/**
 * Author:zhou-study
 * Other: 2021/9/1 - 16:52
 */
public class Circle {
    private double radius;
    public static String name = "这是一个圆！";

    public static String getName() {
        return name;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI*radius*radius;
    }

    public void display(){
        System.out.println("name:"+name+"radius:"+radius);
    }
}
