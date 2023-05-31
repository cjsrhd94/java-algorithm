package string;

public class Programmers_숫자_짝꿍 {

	public static void main(String[] args) {
		Programmers_숫자_짝꿍 main = new Programmers_숫자_짝꿍();
		main.solution("100","203045");
	}
	public String solution(String X, String Y) {
		char[] numArr = {'0','1','2','3','4','5','6','7','8','9'};
		int[] xArr = {0,0,0,0,0,0,0,0,0,0};
		int[] yArr = {0,0,0,0,0,0,0,0,0,0};
 		int[] coupleArr = {0,0,0,0,0,0,0,0,0,0};
		StringBuilder answer = new StringBuilder();

		for (int k = 0; k < numArr.length; k++) {
			xArr[k] = X.length() - X.replace(String.valueOf(numArr[k]), "").length();
			yArr[k] = Y.length() - Y.replace(String.valueOf(numArr[k]), "").length();
		}
		for (int i = 0; i < coupleArr.length; i++) {
			if (xArr[i] > yArr[i]) {
				coupleArr[i] = yArr[i];
			} else {
				coupleArr[i] = xArr[i];
			}
		}

		boolean isChanged = false;
		for (int i = 0; i < coupleArr.length; i++) {
			if (coupleArr[i] != 0) {
				isChanged = true;
			}
		}
		if ( !isChanged ) {
			return "-1";
		}

		for (int i = numArr.length - 1 ; i >= 0; i--) {
			if (i == 0 && coupleArr[0] != 0 && answer.toString().equals("")) {
				return "0";
			}
			answer.append(String.valueOf(numArr[i]).repeat(coupleArr[i]));
		}

		return answer.toString();
	}
}
