package math;

import java.util.Scanner;

public class Inf0210_봉우리 {
    public static void main(String[] args) {
        Inf0210_봉우리 main = new Inf0210_봉우리();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(main.solution(n, arr));

    }

    private int solution(int n, int[][] arr) {
        // 4방향에 대한 좌표값을 미리 선언
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                // 4방향을 순회한다.
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0
                            && nx < n
                            && ny >= 0
                            && ny < n
                            && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
