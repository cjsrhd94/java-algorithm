package math;

import java.util.Scanner;

public class BAEKJOON_2292 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n = 0;

        while(true){
            int sum = 3*(n + (int)Math.pow(n, 2)) + 1;
            if (num > sum){
                n++;
                continue;
            } else {
                break;
            }
        }
        System.out.println(n + 1);
    }
}
