package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int maxNum = 0;
        int maxCount = 0;
        for (int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > maxNum){
                maxNum = arr[i];
                maxCount = i+1;
            }
        }
        System.out.println(maxNum);
        System.out.println(maxCount);
    }
}
