package com.algorithm.chapter_0;

/**
 * 0.1. 최대와 최소
 */

public class Chapter_0_1 {
    // 1. 간단한 문제. 두 수 중 가장 큰 값과 작은 값을 반환하는 함수
    int min (int x, int y) {
        if (x < y) return x;
        return y;
    }
    int max (int x, int y) {
        if (x > y) return x;
        return y;
    }

    // 2. 배열의 최대값/최소값을 구하는 함수
    int max_arr (int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }
    int min_arr (int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }

    public static void main(String[] args) {
        Chapter_0_1 chapter = new Chapter_0_1();
        System.out.println(chapter.max(0, 1));
        System.out.println(chapter.min(2, 1));
        System.out.println(chapter.max_arr(new int[]{0, 1, 2}));
        System.out.println(chapter.max_arr(new int[]{4, 1, 2}));
    }
}
