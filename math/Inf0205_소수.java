package math;

import java.util.Scanner;

public class Inf0205_소수 {
    public static void main(String[] args) {
        Inf0205_소수 main = new Inf0205_소수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(main.solution(n));
    }

    private int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1];
        // 2부터 n까지 숫자 증가
        for (int i = 2; i <=n; i++) {
            // ch[i]의 값이 0이면 소수이다.
            if (ch[i] == 0) {
                answer++;
                // 따라서 소수의 배수들을 체크하여 1을 넣어준다.
                for (int j=i; j<=n; j=j+i) {
                    ch[j] = 1;
                }
            }
        }

        return answer;
    }
}
