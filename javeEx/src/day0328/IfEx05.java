package day0328;

public class IfEx05 {
	public static void main(String[] args) {
		// 점수로 사용할 변수 score 
		// 90점 이상일때 A, 80점 이상일때 B, 70이상일때 C, 60이상일때 D, 그외 F
		// 최종 결과로는 B가 나오도록 
		
		int score = 85;
		String result;
		
		if (score>=90) {
			result = "A";
		}
		else if (score>=80) {
			result = "B";
		}
		else if (score>=70) {
			result = "C";
		}
		else if (score>=60) {
			result = "D";
		}
		else {
			result = "F";
		}
		System.out.println(result);
	}
}
