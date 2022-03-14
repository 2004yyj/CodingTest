import java.util.*;

public class Solution {
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> index = new HashMap<>();
        Map<String, Set<Integer>> list = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            index.put(id_list[i], i);
        }

        for (String rep: report) {
            String[] ids = rep.split(" ");
            String fromId = ids[0], toId = ids[1];
            if (!list.containsKey(toId)) list.put(toId, new HashSet<>());
            Set<Integer> temp = list.get(toId);
            temp.add(index.get(fromId));
        }

        for (String id : id_list) {
            if (list.containsKey(id) && list.get(id).size() >= k) {
                for (int idx : list.get(id)) {
                    answer[idx]++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] result = solution(
                new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2
        );

        System.out.println(Arrays.toString(result));
    }
}