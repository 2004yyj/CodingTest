import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        int idx = 0;
        String[] numbersStr = new String[numbers.length];
        for (int number: numbers) numbersStr[idx++] = Integer.toString(number);
        Arrays.sort(numbersStr, (before, current) -> (current + before).compareTo(before + current));
        if (numbersStr[0].equals("0")) return "0";
        return String.join("", numbersStr);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[] {3, 30, 34, 5, 9, 10, 81, 19, 89}));
    }
}