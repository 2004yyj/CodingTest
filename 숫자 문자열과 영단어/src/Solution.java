class Solution {
    public static int solution(String s) {
        String answer = "";
        String stringNumber = "";
        char[] stringArr = s.toCharArray();

        for (int i = 0; i < stringArr.length + 1; i++) {
            if (replaceNumber(stringNumber) != -1) {
                answer += replaceNumber(stringNumber);
                stringNumber = "";
            }
            if (i > stringArr.length - 1) break;

            char character = stringArr[i];
            if (Character.isDigit(character)) {
                answer += character;
            } else {
                stringNumber += character;
            }
        }

        return Integer.parseInt(answer);
    }

    public static int replaceNumber(String digit) {
        int number = 0;
        switch (digit) {
            case "one" -> number = 1;
            case "two" -> number = 2;
            case "three" -> number = 3;
            case "four" -> number = 4;
            case "five" -> number = 5;
            case "six" -> number = 6;
            case "seven" -> number = 7;
            case "eight" -> number = 8;
            case "nine" -> number = 9;
            case "zero" -> number = 0;
            default -> number = -1;
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
    }
}