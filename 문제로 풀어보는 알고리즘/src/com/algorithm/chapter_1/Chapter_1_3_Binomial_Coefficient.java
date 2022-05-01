package com.algorithm.chapter_1;

/**
 * 3. 이항계수
 * 경우의 수를 계산하는 것
 */

public class Chapter_1_3_Binomial_Coefficient {

    public int factorial(int value) {
        if (value == 1 || value == 0)
            return 1;
        else
            return value * factorial(value - 1);
    }

    public static void main(String[] args) {
        Chapter_1_3_Binomial_Coefficient chapter = new Chapter_1_3_Binomial_Coefficient();
        System.out.println(chapter.factorial(5));
    }
}
