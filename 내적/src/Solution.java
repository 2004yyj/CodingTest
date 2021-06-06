public class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 1234567890;
        int len = a.length;

        for (int i = 0; i < len; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }
}
