package day0328;

public class IfEx07 {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);//원하는 값을 넣고싶을떄
		String grade = "";
		
		if (score >= 90 ) { 
			// 첫번째 if문의 조건이 true 일 때 
			if (score >= 95) { 
				grade = "A+";
			}else {
				grade = "A";
			}
		}else { // 첫번째 if문의 조건이 false 일 때
			if (score >= 85 ) {
				grade = "B+";
			}else {
				grade = "B";
			}
		}
		System.out.println(grade);
	}
}
