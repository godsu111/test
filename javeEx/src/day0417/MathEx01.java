package day0417;
/*
	Math 클래스
		자바에서의 수학 담당
		정적 메서드만 제공
*/
public class MathEx01 {
	public static void main(String[] args) {
		// 정적 메서드 		: 객체생성 없이 사용가능 클래스이름.메서드()
		// Math.abs()	: 절대값 -> 무조건 양수로 변환
		System.out.println(Math.abs(-20));
		
		// Math.ceil()	: 올림 (소수점 있으면 올림)
		System.out.println(Math.ceil(4.2)); 	// 5.0
		
		// Math.floor()	: 내림 (소수점 있으면 내림)
		System.out.println(Math.floor(4.8)); 	// 4.0
		
		// Math.round()	: 반올림 (소수점 반올림)
		System.out.println(Math.round(4.5)); 	// 5
		
		// Math.max(값, 값) 	: 둘 중 큰 값 			
		System.out.println(Math.max(10, 20));	// 20
	
		// Math.min(값, 값)	: 둘 중 작은 값			
		System.out.println(Math.min(10, 20));	// 10
		
		// Math.random()	: 0~1 사이의 랜덤 실수 (0~0.9xxxxx)	
		// (int)(Math.random()*10)+1: 1~10까지의 랜덤 정수
		System.out.println((int)(Math.random()*10)+1);
	}
}