package recursion;

import java.util.Scanner;

public class Inf0704_피보나치_재귀 {
    static int[] fibo;

    public static void main(String[] args) {
        Inf0704_피보나치_재귀 main = new Inf0704_피보나치_재귀();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo = new int[n + 1];
        main.DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

    private int DFS(int n) {
        // 중복계산을 제거하기 위해 사용한다. 이미 값이 있는 것들은 재사용한다.
        if (fibo[n] > 0) return fibo[n];
        if (n == 1) {
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n - 2) + DFS(n - 1);
        }
    }
}
