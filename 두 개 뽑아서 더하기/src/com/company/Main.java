package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {

                int num = numbers[i] + numbers[j];

                if (i != j && !answer.contains(num)) {
                    answer.add(num);
                }
            }
        }

        Collections.sort(answer);

        int[] answerArr = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            answerArr[i] = answer.get(i);
        }

        System.out.println(Arrays.toString(answerArr));
    }
}
