package string;

public class Programmers_서울에서_김서방_찾기 {
    public String solution(String[] seoul) {
        int spot = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                spot = i;
                break;
            }
        }
        return "김서방은 " + spot + "에 있다";
    }
}
