package com.problem;

/**
 * Author:zhou-study
 * Other: 2021/9/5 - 17:09
 */
public class Firset {
    public static boolean foo(char c) {
        System.out.print(c);
        return true;
    }

    public static void main(String[] args) {
        int i = 0;
        for (foo('A'); foo('B') && (i < 2); foo('C')) {
            i++;// 1 2
            foo('D');
        }
    }
}
