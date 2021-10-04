package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEKJOON_2805 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        //이분탐색
        long high = arr[N-1];
        long low = 1;

        while (low <= high){
            long height = 0;
            long mid = (low + high) / 2;

            for (int i = 0; i < N; i++){
                if(arr[i]>=mid){
                    height += arr[i] - mid;
                }
            }

            if (height >= M){
                low = mid + 1;
            } else if (height < M){
                high = mid - 1;
            }
        }
        System.out.println(high);
    }
}
