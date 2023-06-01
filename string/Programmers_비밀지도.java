package string;

public class Programmers_비밀지도 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] toCoordinate1 = toCoordinate(arr1, n);
		String[] toCoordinate2 = toCoordinate(arr2, n);
		String[] realMap = new String[n];

		for (int i = 0; i < realMap.length; i++) {
			String point = "";
			for (int j = 0; j < n; j++) {
				if (toCoordinate1[i].charAt(j) == '1' || toCoordinate2[i].charAt(j) == '1') {
					point += "#";
				} else {
					point += " ";
				}
			}
			realMap[i] = point;
		}
		return realMap;
	}

	private String[] toCoordinate (int[] arr, int n) {
		String[] toCoordinate = new String[n];
		for (int i = 0; i < arr.length; i++) {
			String coordinate = "";
			int tmp = arr[i];
			while (tmp != 0) {
				coordinate = tmp % 2 + coordinate;
				tmp = tmp / 2;
			}
			while (coordinate.length() != n) {
				coordinate = "0" + coordinate;
			}
			toCoordinate[i] = coordinate;
		}
		return toCoordinate;
	}
}
