package string;

public class Programmers_핸드폰_번호_가리기 {
    public String solution(String phone_number) {
        int length = phone_number.length();
        String star = phone_number.substring(0, length-4).replaceAll("[0-9]", "*");
        String rest = phone_number.substring(length-4, length);
        String result = star.concat(rest);
        return result;
    }
}
