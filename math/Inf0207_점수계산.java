package math;

import java.util.Scanner;

public class Inf0207_점수계산 {
    public static void main(String[] args) {
        Inf0207_점수계산 main = new Inf0207_점수계산();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(main.solution(n, arr));
    }

    private int solution(int n, int[] arr) {
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }
        return answer;
    }
}
