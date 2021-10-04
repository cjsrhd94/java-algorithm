package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON_10872 {
    public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int fac = 1;
        for (int i = 1; i <= N; i++){
            fac *= i;

        }
        System.out.println(fac);
    }
}
