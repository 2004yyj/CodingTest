public class Solution {
    public static int solution(int num) {
        int answer = 0;

        while (answer < 500) {
            if (num == 1) return answer;
            else if (num % 2 == 0) num /= 2;
            else num = (num * 3) + 1;
            answer++;
        }

        return -1;
    }

    public static void main(String args[]) {
        System.out.println(solution(626331));
    }
}
