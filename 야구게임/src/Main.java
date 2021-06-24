import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());

        int[] randNums = new int[3];
        for (int i = 0; i < randNums.length; i++) {
            randNums[i] = rand.nextInt(9);
        }

        Scanner sc = new Scanner(System.in);

        int ballCnt = 0;
        int strikeCnt = 0;

        try {
            int[] inputNums = inputNum(sc);

            for (int i = 0; i < randNums.length; i++) {
                for (int j = 0; j < inputNums.length; j++) {
                    if (randNums[i] == inputNums[j]) {
                        if (i == j) {
                            strikeCnt++;
                        } else {
                            ballCnt++;
                        }
                    }
                }
            }

            if (strikeCnt == 0 && ballCnt == 0) {
                System.out.println("아웃");
            } else {
                System.out.println(strikeCnt + "S" + ballCnt + "B");
            }
            System.out.println("숫자를 맞춰보세요");
            inputNums = inputNum(sc);

            boolean flags = false;
            for (int i = 0; i < randNums.length; i++) {
                if (randNums[i] != inputNums[i]) {
                    flags = true;
                    break;
                }
            }

            if (flags) {
                System.out.println("틀렸습니다.");
            } else {
                System.out.println("정답입니다.");
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("정확히 3자리수까지 입력해주세요.");
        } catch (NumberFormatException e) {
            throw new NumberFormatException("숫자만 입력해주세요.");
        }
    }

    private static int[] inputNum(Scanner sc) {
        String scanNums = sc.nextLine();
        String[] splitScanNum = scanNums.split("");

        if (splitScanNum.length != 3) {
            throw new IndexOutOfBoundsException("정확히 3자리수까지 입력해주세요.");
        }

        int[] inputNums = new int[3];

        for (int i = 0; i < splitScanNum.length; i++) {
            inputNums[i] = Integer.parseInt(splitScanNum[i]);
        }

        return inputNums;
    }
}
