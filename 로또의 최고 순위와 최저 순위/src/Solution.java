import java.util.*;

public class Solution {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int zeroCnt = 0;
        int sameNumberCnt = 0;
        int[] answer = new int[]{0, 0};
        Set<Integer> winNumSet = new HashSet<>();

        for (int number : win_nums) {
            winNumSet.add(number);
        }

        for (int i = 0; i < lottos.length; i++) {
            int number = lottos[i];
            if (number == 0) zeroCnt++;
            else if (winNumSet.contains(number)) {
                sameNumberCnt++;
            }
        }

        answer[0] = sameNumberCnt + zeroCnt;
        answer[1] = sameNumberCnt;

        for (int i = 0; i < answer.length; i++) {
            int answerNum = answer[i];
            switch (answerNum) {
                case 6 -> answer[i] = 1;
                case 5 -> answer[i] = 2;
                case 4 -> answer[i] = 3;
                case 3 -> answer[i] = 4;
                case 2 -> answer[i] = 5;
                default -> answer[i] = 6;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] result = solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19});
        System.out.println(Arrays.toString(result));
    }
}
