package recursion;

import java.util.Scanner;

public class Inf0703_팩토리얼 {
    public static void main(String[] args) {
        Inf0703_팩토리얼 main = new Inf0703_팩토리얼();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(main.DFS(n));
    }

    private int DFS(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * DFS(n-1);
        }
    }
}
