package math;

import java.util.Scanner;

public class Inf0306_최대_길이_연속부분수열 {
    public static void main(String[] args) {
        Inf0306_최대_길이_연속부분수열 main = new Inf0306_최대_길이_연속부분수열();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(main.solution(n, k, arr));
    }

    private int solution(int n, int k, int[] arr) {
        int answer = 0;
        int cnt = 0;
        int lt = 0;
        // rt를 한개씩 증가시킨다.
        for (int rt = 0; rt < n; rt++) {
            // rt가 0을 만나면
            if (arr[rt] == 0) {
                // cnt를 1증가시킨다.
                cnt++;
            }
            // cnt가 주어진 최대치를 넘어선다면
            while (cnt > k) {
                // lt가 0일 때
                if (arr[lt] == 0) {
                    cnt--;
                    lt++;
                }
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }
}
