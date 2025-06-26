package day0328;

public class LoopEx {
	public static void main(String[] args) {
/*		루프(반복문)
 		특정 조건이 만족 될 때까지 {}블럭 안의 코드를 반복 실행하는 구조이다.
 		for 	 문 - 정해진 횟수만큼 반복할 때 사용. : 초기식 -> 조건식 -> 실행문 -> 증감식 -> 조건식 -> ... 
 		while    문 - 조건이 True인 동안 반복할 때 사용. : 조건 검사 -> 실행  
 		do-while 문 - 조건과 상관없이 최소 한 번은 실행하고 이후 반복할 지 결정. : 실행 -> 조건 검사
*/
		String str = "Hello Java";
		System.out.println(str);
		System.out.println(str);
		System.out.println(str);
		System.out.println(str);
		System.out.println(str);
		// for(초기식; 조건식; 증감식){ 실행문; }
		for( int b=1; b<6; b++) {
			System.out.println("hello java");
		}
		
		// 1~10까지의 합
		int a = 0;
		a += 1;       // 1
		a += 2;       // 3
		a += 3;       // 6 
		a += 4;       // 10
		a += 5;       // 15
		a += 6;       // 21
		a += 7;       // 28
		a += 8;       // 36
		a += 9;       // 45
		a += 10;      // 55 
		System.out.println("1~10까지의 합 : "+a);
	}
}
