package math;

import java.util.Scanner;

public class Inf0209_격자판_최대합 {
    public static void main(String[] args) {
        Inf0209_격자판_최대합 main = new Inf0209_격자판_최대합();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(main.solution(n, arr));
    }

    private int solution(int n, int[][] arr) {
        int answer = 0;
        int sum1;
        int sum2;
        // x축을 증가시킨다.
        for (int i = 0; i < n; i++) {
            sum1 = 0;
            sum2 = 0;
            // y축을 증가시킨다.
            for (int j = 0; j < n; j++) {
                // [0][0~4], [1][0~4]
                sum1 += arr[i][j];
                // [0~4][0], [0~4][1]
                sum2 += arr[j][i];
            }
            answer=Math.max(answer, sum1);
            answer=Math.max(answer, sum2);
        }
        sum1 = 0;
        sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-1-i];
        }
        answer=Math.max(answer, sum1);
        answer=Math.max(answer, sum2);

        return answer;
    }
}
