import java.util.*;
class Main {
    public int i = 0;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int hanoiLen = sc.nextInt();

        Main main = new Main();
        main.hanoi(hanoiLen, 1, 2, 3);

        System.out.println(main.i);
    }

    void hanoi(int n, int from, int by, int to) {
        if (n == 1) {
            move(from, to);
        } else {
            hanoi(n - 1, from, to, by);
            move(from, to);
            hanoi(n - 1, by, from, to);
        }
    }

    void move(int from, int to) {
        i++;
    }
}