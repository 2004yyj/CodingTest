import java.util.*;

public class Solution {
    public static String[] solution(String[] record) {
        Map<String, String> userMap = new HashMap<>();
        int changedCount = 0;

        for (String value : record) {
            String[] recordElement = value.split(" ");
            if (!recordElement[0].equals("Leave")) {
                userMap.put(recordElement[1], recordElement[2]);
                if (recordElement[0].equals("Change"))
                    changedCount++;
            }
        }

        String[] answer = new String[record.length - changedCount];
        int index = 0;

        for (String value : record) {
            String[] recordElement = value.split(" ");
            if (recordElement[0].equals("Enter"))
                answer[index++] = userMap.get(recordElement[1]) + "님이 들어왔습니다.";
            else if (recordElement[0].equals("Leave"))
                answer[index++] = userMap.get(recordElement[1]) + "님이 나갔습니다.";
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] result = solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"});
        System.out.println(Arrays.toString(result));
    }
}
