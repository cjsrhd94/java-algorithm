package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];

        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }

        String str = br.readLine();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(arr[ch - 'a'] == -1){
                arr[ch - 'a'] = i;
            }
        }

        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
    }
}
