package string;

import java.util.HashMap;
import java.util.Scanner;

public class Inf0404_모든_아나그램_찾기 {
    public static void main(String[] args) {
        Inf0404_모든_아나그램_찾기 main = new Inf0404_모든_아나그램_찾기();
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String s = sc.next();
        System.out.print(main.solution(t, s));
    }

    private int solution(String t, String s) {
        int answer = 0;
        HashMap<Character, Integer> tmap = new HashMap<>();
        HashMap<Character, Integer> smap = new HashMap<>();
        // 단어에 들어간 문자의 개수를 센다.
        for (char x : s.toCharArray()) {
            smap.put(x, smap.getOrDefault(x, 0) + 1);
        }
        // 타겟 문자열의 초깃값을 세팅한다.
        int L = s.length() - 1;
        for (int i = 0; i < L; i++) {
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) + 1);
        }
        int lt = 0;
        for (int rt = L; rt < t.length(); rt++) {
            tmap.put(t.charAt(rt), tmap.getOrDefault(t.charAt(rt), 0) + 1);
            if (tmap.equals(smap)) {
                answer++;
                tmap.put(t.charAt(lt), tmap.get(t.charAt(lt)) - 1);
                if (tmap.get(t.charAt(lt)) == 0) {
                    tmap.remove(t.charAt(lt));
                }
                lt++;
            }
        }
        return answer;
    }


}
