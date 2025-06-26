package day0328;

public class IfEx06 {
	public static void main(String[] args) {
		// 중첩 if문
		int score = 97;
		String grade = ""; // 값을 대입해줘야함 안그러면 문법적으로 오류가 발생
		
		if (score >= 90 ) {
			if (score >= 95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		}
		System.out.println(grade);
	}
}
