import java.util.*;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        int i;
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[i];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = sol.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        System.out.println(s);
    }
}
