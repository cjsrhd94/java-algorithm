package math;

import java.util.Scanner;

public class Inf0204_피보나치_수열 {
    public static void main(String[] args) {
        Inf0204_피보나치_수열 main = new Inf0204_피보나치_수열();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x : main.solution(n)) {
            System.out.print(x + " ");
        }
    }

    private int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i-1] + answer[i-2];
        }
        return answer;

    }
}
