package com.classTest;

import org.junit.Test;

/**
 * Author:zhou-study
 * Other: 2021/8/30 - 16:59
 */
public class BubbleSoutTest {

    @Test
    public void test1(){
        int[] arr = new int[]{12,3,35,-23,234,67,99,24};
        //冒泡排序，从小到大
        for(int i =0;i<=arr.length-1;i++){
            for (int j =0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }

        //打印出数组
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
