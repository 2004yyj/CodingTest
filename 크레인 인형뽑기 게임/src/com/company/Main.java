package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        ArrayList<Integer> dollList = new ArrayList<>();

        for (int i: moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i - 1] != 0) {
                    if (dollList.isEmpty()) {
                        dollList.add(board[j][i - 1]);
                    }
                    else if (board[j][i - 1] == dollList.get(dollList.size() - 1)) {
                        dollList.remove(dollList.size() - 1);
                        answer+=2;
                    } else {
                        dollList.add(board[j][i - 1]);
                    }
                    board[j][i - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
