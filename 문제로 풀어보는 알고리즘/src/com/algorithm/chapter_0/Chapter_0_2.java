package com.algorithm.chapter_0;

/**
 * 0.2. 두 변수의 값 바꾸기
 */

public class Chapter_0_2 {

    // 1. 변수 swap 함수
    void swap() {
        int a = 3;
        int b = 3;
        int temp;

        System.out.println(a + " " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }

    // 2. 배열 swap 함수
    void swap_arr(int[] arr, int i, int j) {
        int temp;

        System.out.println(arr[i] + " " + arr[j]);

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        System.out.println(arr[i] + " " + arr[j]);
    }

    public static void main(String[] args) {
        Chapter_0_2 chapter = new Chapter_0_2();
        chapter.swap();
        chapter.swap_arr(new int[] {0, 1, 2}, 1, 2);
    }
}
