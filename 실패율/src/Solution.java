/**
 * 실패율 구하기
 *
 * https://programmers.co.kr/learn/courses/30/lessons/42889
 *
 */

import java.util.*;
import java.util.Map.Entry;

public class Solution {
    public Integer[] solution(int N, int[] stages) {
        List<Integer> answerList = new ArrayList<>();

        TreeMap<Integer, Double> treeMap = new TreeMap<>();

        for (int curStage = 1; curStage <= N; curStage++) {
            int triedCnt = 0;
            int failureCnt = 0;
            for (int stage : stages) {
                if (stage >= curStage) {
                    if (curStage == stage) {
                        failureCnt++;
                    }
                    triedCnt++;
                }
            }
            double value = 0;
            if(failureCnt != 0 && triedCnt != 0) {
                value = (double) failureCnt / triedCnt;
            }
            treeMap.put(curStage, value);
        }

        List<Entry<Integer, Double>> list = new ArrayList<>(treeMap.entrySet());
        list.sort(Entry.comparingByValue(Comparator.reverseOrder()));

        for (Entry<Integer, Double> entry: list) {
            answerList.add(entry.getKey());
        }

        return answerList.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Integer[] answer = sol.solution(4, new int[]{4,4,4,4,4});
        System.out.println(Arrays.toString(answer));
    }
}