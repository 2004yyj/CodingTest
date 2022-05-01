package com.algorithm.chapter_1;

/**
 * 1. 팩토리얼
 */

public class Chapter_1_1_Factorial {

    public int factorial(int value) {
        if (value == 1 || value == 0)
            return 1;
        else
            return value * factorial(value - 1);
    }

    public static void main(String[] args) {
        Chapter_1_1_Factorial chapter = new Chapter_1_1_Factorial();
        System.out.println(chapter.factorial(5));
    }
}
