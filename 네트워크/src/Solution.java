import java.util.Arrays;

class Solution {

    public int solution(int n, int[][] computers) {
        int answer = 0;
        int length = computers.length;
        boolean[] memo = new boolean[n];
        for (int i = 0; i < length; i++) {
            if (!memo[i]) {
                dfs(computers, i, memo);
                answer++;
            }
        }
        return answer;
    }

    public void dfs(int[][] computers, int i, boolean[] memo) {

        memo[i] = true;
        for (int j = 0; j < computers[i].length; j++) {
            if (i != j && computers[i][j] == 1 && !memo[j]) {
                dfs(computers, j, memo);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3,	new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
        System.out.println(solution.solution(3,	new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));
    }
}