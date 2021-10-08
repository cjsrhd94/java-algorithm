package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int sum = 0;
        int num = 0;
        while (X > sum) {
            num++;
            sum += num;
        }

        if (num % 2 == 0){
            System.out.printf("%d/%d", X+num-sum, sum+1-X);
        } else {
            System.out.printf("%d/%d", sum+1-X, X+num-sum);
        }
    }
}
