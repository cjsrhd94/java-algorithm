package math;

import java.util.ArrayList;
import java.util.Scanner;

public class Inf0206_뒤집은_소수 {
    public static void main(String[] args) {
        Inf0206_뒤집은_소수 main = new Inf0206_뒤집은_소수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : main.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    private ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                // 10으로 나누었을 때 나머지는 자릿수이다.
                int t = tmp % 10;
                // res 변수에 숫자를 역으로 재배열 해준다.
                res = res * 10 + t;
                // 10으로 나누었을 때 몫은 기존 숫자의 마지막 자리를 제외한 새로운 숫자이다.
                tmp = tmp / 10;
            }
            if (isPrime(res)) {
                answer.add(res);

            }        }
        return answer;
    }

    private boolean isPrime(int num) {
        if (num==1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
