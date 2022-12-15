package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Inf0609_뮤직비디오 {
    public static void main(String[] args) {
        Inf0609_뮤직비디오 main = new Inf0609_뮤직비디오();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(m, arr));
    }

    private int solution(int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt) {
            int mid = (lt + rt)/2;
            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid -1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    private int count (int[] arr, int capacity) {
        // dvd 장수;
        int cnt = 1;
        // 분의 합계
        int sum = 0;
        for (int x : arr) {
            // 용량을 초과하면
            if (sum + x > capacity) {
                // dvd가 한장 추가된다.
                cnt++;
                // 새로운 장에서 시작하며 초깃값이 x가 된다.
                sum = x;
            } else {
                sum += x;
            }
        }
        return cnt;
    }
}
