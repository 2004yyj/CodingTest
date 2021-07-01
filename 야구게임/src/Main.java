import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());

        int[] randNums = new int[3];

        for (int i = 0; i < randNums.length; i++) {
            randNums[i] = rand.nextInt(9);
            while(true) {
                if (i > 0 && randNums[i - 1] == randNums[i]) {
                    randNums[i] = rand.nextInt(9);
                }
                break;
            }
        }

        Scanner sc = new Scanner(System.in);
        
        while(true) {

            try {
                int[] inputNums = inputNum(sc);

                int ballCnt = 0;
                int strikeCnt = 0;

                for (int i = 0; i < inputNums.length; i++) {
                    for (int j = 0; j < randNums.length; j++) {
                        if (randNums[j] == inputNums[i]) {
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
                    if (strikeCnt == 3) {
                        System.out.println("정답입니다.");
                        break;
                    } else {
                        System.out.println(strikeCnt + "S" + ballCnt + "B");
                    }
                }

            } catch (IndexOutOfBoundsException e) {
                System.out.println("정확히 3자리수까지 입력해주세요.");
                break;
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력해주세요.");
                break;
            }
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
