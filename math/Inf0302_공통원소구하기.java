package math;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Inf0302_공통원소구하기 {
    public static void main(String[] args) {
        Inf0302_공통원소구하기 main = new Inf0302_공통원소구하기();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr1 = new int[a];
        for (int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int [] arr2 = new int[b];
        for (int j = 0; j < b; j++) {
            arr2[j] = sc.nextInt();
        }
        for (int x : main.solution(a, arr1, b, arr2)) {
            System.out.print(x + " ");
        }
    }

    private ArrayList<Integer> solution(int a, int[] arr1, int b, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1 = 0;
        int p2 = 0;
        while (p1 < a && p2 < b) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1++]);
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return answer;
    }
}
