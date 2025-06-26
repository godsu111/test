package day0328;

public class IfEx03 {
	public static void main(String[] args) {
		int score = 95;
		char grade = ' ';
		
		if( score >= 90 ) {
			grade = 'A';
		}
		else if( score >= 80) {
			grade = 'B';
		}
		else {
			grade = 'C';
		}
		System.out.println("당신의 등급은 : "+grade+"입니다.");
	}
}
// 조건식 ? T 값/식 : F 값/식