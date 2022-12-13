package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Inf0506_공주구하기 {
    public static void main(String[] args) {
        Inf0506_공주구하기 main = new Inf0506_공주구하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(main.solution(n,k));
    }

    private int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while (!queue.isEmpty()) {
            for (int i = 1; i < k; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }
        return answer;
    }
}
