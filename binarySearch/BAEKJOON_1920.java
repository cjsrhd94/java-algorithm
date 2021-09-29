package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BAEKJOON_1920 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);       //이분탐색을 사용하려면 배열이 반드시 정렬되어있어야 한다.

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++){
            if(Arrays.binarySearch(arr, Integer.parseInt(st.nextToken())) >= 0){
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }

        }
        System.out.println(sb);
    }
}
