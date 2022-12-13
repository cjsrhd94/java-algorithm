package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Inf0507_교육과정설계 {
    public static void main(String[] args) {
        Inf0507_교육과정설계 main = new Inf0507_교육과정설계();
        Scanner sc = new Scanner(System.in);
        String essen = sc.next();
        String subject = sc.next();
        System.out.println(main.solution(essen, subject));
    }

    private String solution(String essen, String subject) {
        String answer = "NO";
        Queue<Character> queue = new LinkedList();
        for (char e : essen.toCharArray()) {
            queue.offer(e);
        }
        for (char s : subject.toCharArray()) {
            char tmp = queue.peek();
            if (s == tmp) {
                queue.poll();
            }
            if (queue.size() == 0) {
                break;
            }
        }
        if (queue.isEmpty()) {
            return "YES";
        }
        return answer;
    }
}
