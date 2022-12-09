package math;

import java.util.Scanner;

public class Inf0212_멘토링 {
    public static void main(String[] args) {
        Inf0212_멘토링 T = new Inf0212_멘토링();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); // 학생 수
        int m = kb.nextInt(); // 테스트 개수
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, m, arr));
    }

    private int solution(int n, int m, int[][] arr) {
        int answer = 0;
        int pi = 0;
        int pj = 0;
        int count = 0;


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                count = 0;

                // i번호 학생과 j번호 학생을 고정시키고
                for (int k = 0; k < m; k++) {

                    //k번 테스트의 i와 j 학생의 등수(s)찾기
                    for (int s = 0; s < n; s++) {
                        if (arr[k][s] == i) {
                            pi = s;
                        }
                        if (arr[k][s] == j) {
                            pj = s;
                        }
                    }

                    //테스트 k번에서 i의 등수가 j보다 높다면 count++
                    if (pi < pj) {
                        count++;
                    }
                }

                //모든 테스트에서 등수가 높다면 answer++;
                if (count == m) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
