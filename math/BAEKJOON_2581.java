package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BAEKJOON_2581 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        LinkedList arr = new LinkedList();

        for (int i = M; i <= N; i++){
            for (int j = 2; j <= i; j++){
                if(i%j == 0 && i/j != 1){
                    break;
                }
                if(i == j){
                    arr.add(j);
                }
            }
        }
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            count += (int) arr.get(i);
        }
        if (arr.size() == 0){
            System.out.println(-1);
        } else{
            System.out.println(count);
            System.out.println(arr.get(0));
        }
    }
}
