package string;

import java.util.ArrayList;
import java.util.Scanner;

public class Inf0201_큰_수_출력하기 {

    public static void main(String[] args) {
        Inf0201_큰_수_출력하기 main = new Inf0201_큰_수_출력하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : main.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    private ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i-1]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }

}
