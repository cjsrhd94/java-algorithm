package sort;

import java.util.Scanner;

public class Inf0603_삽입정렬 {
    public static void main(String[] args) {
        Inf0603_삽입정렬 main = new Inf0603_삽입정렬();
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
        // 1. target을 loop하기 때문에 0을 제외한다.
        for (int i = 1; i < n; i++) {
            // 2. target
            int tmp = arr[i];
            // 8. 맨 아래 arr[j + 1]을 타겟으로 설정하기 위해 미리 초기화 해준다.
            int j;
            // 3. target보다 1적은 값부터 가장 작은 값까지 loop한다.
            for (j = i - 1; j >= 0; j--) {
                // 4. 만약 타겟이 비교대상보다 작다면
                if (arr[j] > tmp) {
                    // 5. target과 비교대상과 자리를 바꾼다.
                    arr[j + 1] = arr[j];
                } else {
                    // 6. 그렇지 않다면 자기 자리를 찾은 것이다.
                    break;
                }
            }
            // 7. 타겟 값을 재지정 해준다.
            arr[j + 1] = tmp;
        }
        return arr;
    }
}
