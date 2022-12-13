package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Inf0508_응급실 {
    public static void main(String[] args) {
        Inf0508_응급실 main = new Inf0508_응급실();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(n, m, arr));
    }

    private int solution(int n, int m, int[] arr) {
        int answer = 1;
        Queue<Person> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, arr[i]));
        }
        while (!queue.isEmpty()) {
            Person top = queue.poll();
            for (Person x : queue) {
                if (x.priority > top.priority) {
                    queue.offer(top);
                    top = null;
                    break;
                }
            }
            if (top != null) {
                if (top.id == m) {
                    return answer;
                } else {
                    answer++;
                }
            }
        }
        return answer;
    }
}
