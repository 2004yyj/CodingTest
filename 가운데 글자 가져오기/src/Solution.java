import org.jetbrains.annotations.NotNull;

public class Solution {
    public static @NotNull
    String solution(String s) {
        int mid = s.length()/2;
        String answer;
        if (s.length() % 2 == 0) {
            answer = s.substring(mid - 1, mid + 1);
        } else {
            answer = s.substring(mid, mid + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("qwer"));

    }
}
