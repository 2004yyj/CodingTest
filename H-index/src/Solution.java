import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;
        Arrays.sort(citations);
        for (int i = 0; i < length; i++) {
            int hIndex = length - i;
            if (citations[i] == hIndex) {
                answer = hIndex;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{ 3, 0, 6, 1, 5 }));
    }
}