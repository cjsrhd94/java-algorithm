package math;

import java.util.Scanner;

public class Inf0211_임시반장정하기 {
    public static void main(String[] args) {
        Inf0211_임시반장정하기 main = new Inf0211_임시반장정하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];
        // i : 학생 번호
        for (int i = 1; i <= n; i++) {
            // j : 학년
            for (int k = 1; k <= 5; k++) {
                arr[i][k] = sc.nextInt();
            }
        }
        System.out.print(main.solution(n, arr));
    }

    private int solution(int n, int[][] arr) {
        // 임시반장
        int answer = 0;
        // 최다 횟수
        int max = 0;
        // i : 학생 번호
        for (int i  = 1; i < n; i++) {
            int cnt = 0;
            // j : 학생 번호
            for (int j = 1; j <= n; j++) {
                // k : 학년
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }
}
