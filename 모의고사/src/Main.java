import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5,4,4,2,1})));
    }

    public static int[] solution(int[] answers) {
        int[] cnt = new int[3];
        int[][] exam = {
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3,3,1,1,2,2,4,4,5,5}
        };

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == exam[0][i % 5]) {
                cnt[0]++;
            }
            if (answers[i] == exam[1][i % 8]) {
                cnt[1]++;
            }
            if (answers[i] == exam[2][i % 10]) {
                cnt[2]++;
            }
        }

        int biggest = 0;
        for (int cntInt : cnt) {
            if (biggest < cntInt) {
                biggest = cntInt;
            }
        }

        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < cnt.length; i++) {
            if (biggest == cnt[i] && biggest != 0) {
                answerList.add(i + 1);
            }
        }

        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
