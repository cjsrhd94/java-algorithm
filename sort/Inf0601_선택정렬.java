package sort;

import java.util.Scanner;

public class Inf0601_선택정렬 {
    public static void main(String[] args) {
        Inf0601_선택정렬 main = new Inf0601_선택정렬();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : main.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    // 선택정렬은 for문을 두 번 돌기 떄문에 n2의 복잡도를 가진다.
    private int[] solution(int n, int[] arr) {
        // 맨 마지막 값은 계산하지 않아도 가장 큰 값이기 때문에 n - 1
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            // 정렬된 것 이후 것들부터 for문
            for (int j = i + 1; j < n; j++) {
                // 선택정렬은 loop중 가장 작은 값을 구하는 것이다.
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }

            }
            // arr[i] 자리에 loop중 가장 작은 값인 arr[idx] 값을 대입한다.
            int tmp = arr[i];
            arr[i] = arr[min_idx];
            // arr[idx] 자리에 swap 대상인 arr[i] 값을 대입한다.
            arr[min_idx] = tmp;
        }
        // 실제 배열의 변경이 일어난다.
        return arr;
    }

}
