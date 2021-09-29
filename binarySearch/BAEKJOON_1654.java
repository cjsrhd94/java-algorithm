package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEKJOON_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];

        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

       // 이분탐색
       long high = arr[K-1];
       long low = 1;

       while (low<=high){
           long count = 0;
           long mid = (low + high) / 2;

           for (int i = 0; i < K; i++){
               count += arr[i]/mid;
           }

           if (count >= N){
               low = mid + 1;
           } else if (count < N){
               high = mid - 1;
           }
       }
       System.out.println(high);
    }
}
