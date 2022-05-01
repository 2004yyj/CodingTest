package com.algorithm.chapter_0;

import java.util.Arrays;

/**
 * 0.3. 배열 회전
 */

public class Chapter_0_3 {

    void right_rotate(int[] arr, int firstIndex, int lastIndex) {
        int last = arr[lastIndex];
        for (int i = lastIndex; i > firstIndex; i--) {
            arr[i] = arr[i - 1];
        }
        arr[firstIndex] = last;
        System.out.println(Arrays.toString(arr));
    }

    void left_rotate(int[] arr, int firstIndex, int lastIndex) {
        int first = arr[firstIndex];
        for (int i = firstIndex; i < lastIndex; i++) {
            arr[i] = arr[i + 1];
        }
        arr[lastIndex] = first;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        new Chapter_0_3().right_rotate(new int[] { 0, 1, 2, 3 }, 1, 3);
        new Chapter_0_3().left_rotate(new int[] { 0, 1, 2, 3 }, 1, 3);
    }
}
