package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Inf_0610_마구간_정하기 {
    public static void main(String[] args) {
        Inf_0610_마구간_정하기 main = new Inf_0610_마구간_정하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(n, c, arr));
    }

    private int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        // 마굿간 좌표의 좌단 값
        int lt = arr[0];
        // 마굿간 좌표의 우단 값
        int rt = arr[n - 1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        return answer;
    }

    private int count(int[] arr, int dist) {
        // 말 한마리 배치
        int cnt = 1;
        // 가장 왼쪽에 배치
        int ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // arr[i] - ep 값이 mid 값보다 커야한다.
            if (arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }
}
