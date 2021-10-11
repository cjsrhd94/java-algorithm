package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEKJOON_2110 {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int left = 1;
        int right = arr[N-1] - arr[0];
        int d = 0;                          // 공유기 사이의 거리
        int ans = 0;

        while (left <= right){
            int start = arr[0];
            int cnt = 1;                    // 공유기 갯수, 최소 두개는 설치한다.
            int mid = (left + right) / 2;

            for (int i = 0; i < N; i++){
                d = arr[i] - start;
                if(d >= mid){
                    cnt++;
                    start = arr[i];
                }
            }

            if (cnt >= C) {                 // 공유기 갯수가 많다면
                ans = mid;
                left = mid + 1;             // 공유기 사이의 거리를 늘린다.
            } else {                        // 공유기 갯수가 적다면
                right = mid - 1;            // 공유기 사이의 거리를 줄인다.
            }
        }
        System.out.println(ans);
    }
}
