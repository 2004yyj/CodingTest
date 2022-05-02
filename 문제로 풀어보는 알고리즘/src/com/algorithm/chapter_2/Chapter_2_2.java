package com.algorithm.chapter_2;

import java.util.Scanner;

public class Chapter_2_2 {

    static int size = 100;
    static int[][] map = new int[size][size];

    int shortestPath(int m, int n) {
        int[][] path = new int[m][n];
        path[0][0] = map[0][0];

        for (int i = 1; i < m; i++) {
            if (map[i][0] == 0)
                path[i][0] = 0;
            else
                path[i][0] = path[i - 1][0];
        }

        for (int j = 1; j < n; j++) {
            if (map[0][j] == 0)
                path[0][j] = 0;
            else
                path[0][j] = path[0][j - 1];
        }

        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++) {
                if (map[i][j] == 0)
                    path[i][j] = 0;
                else
                    path[i][j] = path[i - 1][j] + path[i][j - 1];
            }

        return path[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(), n = sc.nextInt();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }

        sc.close();

        Chapter_2_2 chapter = new Chapter_2_2();
        System.out.println(chapter.shortestPath(m, n));
    }
}
