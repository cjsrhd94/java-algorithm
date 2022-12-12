package string;

import java.util.HashMap;
import java.util.Scanner;

public class Inf0401_학급_회장 {
    public static void main(String[] args) {
        Inf0401_학급_회장 main = new Inf0401_학급_회장();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(main.solution(n, str));
    }

    private char solution(int n, String str) {
        char answer = ' ';
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : map.keySet()) {
            if (map.get(x) > max) {
                max = map.get(x);
                answer = x;
            }
        }
        return answer;
    }
}
