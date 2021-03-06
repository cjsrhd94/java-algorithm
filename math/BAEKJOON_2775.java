package math;

import java.util.Scanner;

public class BAEKJOON_2775 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] apart = new int[15][15];

        for(int i = 0; i <15; i++){
            apart[i][1] = 1;
            apart[0][i] = i;
        }
        for (int i = 1; i < 15; i++){
            for (int j = 2; j < 15; j++){
                apart[i][j] = apart[i-1][j] + apart[i][j-1];
            }
        }

        int testCase = sc.nextInt();

        for(int i = 0; i < testCase; i++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(apart[k][n]);
        }
        sc.close();
    }
}
