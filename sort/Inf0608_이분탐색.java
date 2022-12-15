package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Inf0608_이분탐색 {
    public static void main(String[] args) {
        Inf0608_이분탐색 main = new Inf0608_이분탐색();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(n, m, arr));
    }

    private int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        // 검색 범위의 좌단을 정의한다.
        int lt = 0;
        // 검색 범위의 우단을 정의한다.
        // ex) n = 8일경우 최우단이 arr[7]이기 때문에 n-1;
        int rt = n - 1;
        while (lt <= rt) {
            // lt와 rt의 중간값을 설정한다.
            int mid = (lt + rt) / 2;
            // arr[mid]의 값이 찾던 값이라면
            if (arr[mid] == m) {
                // 반복을 끝내고 답을 return한다.
                // ex) arr[2] 값이 답일 경우 answer이 세번째 위치하기 때문에 mid + 1;
                answer = mid + 1;
                break;
            }
            // 만약 arr[m] 우측에 있다면, 검색 범위의 우단을 arr[m-1]까지로 변경한다.
            if (arr[mid] > m) {
                rt = mid - 1;
            }
        }
        return answer;
    }
}
