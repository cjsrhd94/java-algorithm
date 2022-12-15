package sort;

import java.util.Scanner;

public class Inf0602_버블정렬 {
    public static void main(String[] args) {
        Inf0602_버블정렬 main = new Inf0602_버블정렬();
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

    private int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            // 정렬한 값은 제외하고 for문
            for (int j = 0; j < n - i - 1; j++) {
                // 현재 값이 다음 값보다 크면
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
