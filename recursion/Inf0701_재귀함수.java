package recursion;

import java.util.Scanner;
import java.util.Stack;

public class Inf0701_재귀함수 {
    public static void main(String[] args) {
        Inf0701_재귀함수 main = new Inf0701_재귀함수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        main.DFS(n);
    }

    private void DFS(int n) {
        if (n == 0) {
            return;
        } else {
//            System.out.print(n + " ");
            DFS(n - 1);
            /* 스택 프레임 */
            /* 해당 위치까지의 작업들이 stack으로 쌓여있다가,
            * n == 0 조건에 걸려 return되어 끝나면,
            * 이전에 실행되지 않았던 라인부터 pop되며 실행된다.*/
            System.out.print(n + " ");
        }
    }
}
