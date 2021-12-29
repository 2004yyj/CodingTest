import java.util.*;

public class Solution {
    public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> scovilleQueue = new PriorityQueue<>();
        Arrays.sort(scoville);

        for (int j : scoville) {
            scovilleQueue.offer(j);
        }

        while (scovilleQueue.peek() < K) {
            if (scovilleQueue.size() == 1)
                return -1;

            int first = scovilleQueue.poll();
            int next = scovilleQueue.poll();

            int result = first + (next * 2);

            scovilleQueue.offer(result);

            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }
}
