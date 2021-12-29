import java.util.*;

public class Solution {
    public static boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>(Arrays.asList(phone_book));

        for (String s : phone_book)
            for (int j = 1; j < s.length(); j++)
                if (set.contains(s.substring(0, j)))
                    return false;

        return true;
    }

    public static void main(String[] args) {
        boolean result = solution(new String[]{"123", "456", "789"});
        System.out.println(result);
    }
}
