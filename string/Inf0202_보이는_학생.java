package string;

import java.util.Scanner;

public class Inf0202_보이는_학생 {
    public static void main(String[] args) {
        Inf0202_보이는_학생 main = new Inf0202_보이는_학생();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(n, arr));
    }

    private int solution(int n, int[] arr) {
        int answer = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                answer++;
            }
        }
        return answer;
    }
}
