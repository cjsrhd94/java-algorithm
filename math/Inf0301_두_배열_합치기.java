package math;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Inf0301_두_배열_합치기 {
    public static void main(String[] args) {
        Inf0301_두_배열_합치기 main = new Inf0301_두_배열_합치기();
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
        for (int x : main.twoPointerSolution(a, arr1, b, arr2)) {
            System.out.print(x + " ");
        }
    }

    private ArrayList<Integer> solution(int a, int[] arr1, int b, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int x : arr1) {
            answer.add(x);
        }
        for (int y : arr2) {
            answer.add(y);
        }
        Collections.sort(answer);
        return answer;
    }

    private ArrayList<Integer> twoPointerSolution(int a, int[] arr1, int b, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        // 포인터
        int p1 = 0;
        int p2 = 0;
        while (p1 < a && p2 < b) {
            // 작은 값을 우선 넣는다.
            if (arr1[p1] < arr2[p2]) {
                answer.add(arr1[p1++]);
            } else {
                answer.add(arr2[p2++]);
            }
        }
        // 포인터간 비교가 끝나고 나머지 값들을 차례로 넣어준다.
        while (p1 < a) {
            answer.add(arr1[p1++]);
        }
        while (p2 < b) {
            answer.add(arr2[p2++]);
        }
        return answer;
    }
}
