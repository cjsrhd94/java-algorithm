package math;

import java.util.Scanner;

public class Inf0304_연속부분수열 {
    public static void main(String[] args) {
        Inf0304_연속부분수열 main = new Inf0304_연속부분수열();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(main.solution(n, m, arr));
    }

    private int solution(int n, int m, int[] arr) {
        int answer = 0;
        int sum = 0;
        // p1은 좌측 포인터이다.
        int p1 = 0;
        // p2는 우측 포인터이다.
        for (int p2 = 0; p2 < n; p2++) {
            sum += arr[p2];
            if (sum == m) {
                answer++;
                while (sum >= m) {
                    sum = sum - arr[p1++];
                    if (sum == m) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
