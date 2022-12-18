package recursion;

import java.util.Scanner;

public class Inf0702_이진수_출력 {
    public static void main(String[] args) {
        Inf0702_이진수_출력 main = new Inf0702_이진수_출력();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        main.DFS(n);
    }

    private void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n/2);
            System.out.print(n%2);
        }
    }
}
