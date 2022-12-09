package math;

import java.util.Scanner;

public class Inf0303_최대_매출 {
    public static void main(String[] args) {
        Inf0303_최대_매출 main = new Inf0303_최대_매출();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(main.solution(n, k, arr));
    }

    private int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        for (int j = k; j < n; j++) {
            sum += (arr[j] - arr[j-k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }
}
