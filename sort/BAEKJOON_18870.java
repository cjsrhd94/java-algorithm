package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BAEKJOON_18870 {
    public static void main (String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        Map<Integer, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        /*
        Arrays.sort를 사용하면 배열의 원본이 수정된다.
        따라서 배열의 원본을 유지하기 위해 arr의 clone을 만들고 sort를 사용한다.
         */

        int[] arrClone = arr.clone();
        Arrays.sort(arrClone);

        int count = 0;
        for (int i = 0; i < arrClone.length; i++){
            if(!map.containsKey(arrClone[i])){
                map.put(arrClone[i], count++);
            }
        }

        for (int i = 0; i < arr.length; i++){
            sb.append(map.get(arr[i])).append(" ");
        }
        System.out.println(sb);
    }
}
