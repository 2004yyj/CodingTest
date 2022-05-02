package com.algorithm.chapter_1;

/**
 * 4. 피보나치 수열
 */


public class Chapter_1_4_Fibonacci {
    private static final int MEMOIZATION_MAX = 500;

    /*** n의 크기가 커질수록 중복 계산이 많아져 시간이 비약적으로 증가하는 형태의 재귀함수.
     * ex) fibo(5)를 실행할 시
     * fibo(4) + fibo(3) / fibo(3) + fibo(2) / fibo(2) + fibo(1) + fibo(2)
     * fibo(3) + fibo(2) / fibo(2) + fibo(1) + fibo(2) 이 되어서 중복된 코드를 실행하는 것을 알 수 있음. 굉장히 비효율적임.
     */
    public int fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /*** 메모이제이션을 통해 중복 계산을 없애 시간복잡도를 줄인 형태의 재귀함수.
     * ex) fibo(5) 실행 시
     * fibo(4) + fibo(3) / fibo(3) + fibo(2) -> memo[2]에 저장 / fibo(2) -> 저장된 memo[2] 사용 + fibo(1) -> memo[3]에 저장
     * fibo(3) -> 저장된 memo[3] 사용 + fibo(2) -> 저장된 memo[2] 사용
     * 메모이제이션 덕분에 fibo(1)에서 fibo(n)까지 한번씩만 실행되기 때문에 시간복잡도는 O(n)이 되는 것을 알 수 있음
     */
    private final int[] memo = new int[MEMOIZATION_MAX];
    public int fibonacciMemoization(int n) {
        if (memo[n] > 0)
            return memo[n];

        if (n == 1 || n == 2)
            return memo[n] = 1;
        else
            return memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        long beforeTime;
        long afterTime;
        long secDiffTime;
        Chapter_1_4_Fibonacci chapter = new Chapter_1_4_Fibonacci();

        beforeTime = System.nanoTime();
        chapter.fibonacci(20);
        afterTime = System.nanoTime();
        secDiffTime = afterTime - beforeTime;
        System.out.println("fibonacci 함수 실행 시 걸린 시간 "+secDiffTime);

        beforeTime = System.nanoTime();
        chapter.fibonacciMemoization(20);
        afterTime = System.nanoTime();
        secDiffTime = afterTime - beforeTime;
        System.out.println("fibonacciMemoization 함수 실행 시 걸린 시간 "+secDiffTime);
    }
}
