package inputOutput;

import java.util.Scanner;

public class BAEKJOON_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        String B = sc.next();

        int sum = 0;

        for (int i = 0; i < A; i ++){
            sum += B.charAt(i)-'0';
        }
        System.out.print(sum);
        sc.close();
    }
}