package stack;

import java.util.Scanner;
import java.util.Stack;

public class Inf0503_크레인_인형뽑기 {
    public static void main(String[] args) {
        Inf0503_크레인_인형뽑기 main = new Inf0503_크레인_인형뽑기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(main.solution(board, moves));
    }

    private int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int m : moves) {
            for (int i = 0; i < board.length; i++) {
                // m이 1부터 시작하기 때문에 m-1을 대입
                if (board[i][m - 1] != 0) {
                    int tmp = board[i][m - 1];
                    board[i][m - 1] = 0;

                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
