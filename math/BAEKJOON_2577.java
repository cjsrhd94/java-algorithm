package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON_2577 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String multiply = String.valueOf(A*B*C);

        for(int i = 0; i < multiply.length(); i++){
            arr[(multiply.charAt(i) - 48)]++;
        }

        for (int j = 0; j < arr.length; j++){
            System.out.println(arr[j]);
        }
    }
}
