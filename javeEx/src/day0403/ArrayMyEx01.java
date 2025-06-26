package day0403;

public class ArrayMyEx01 {
	public static void main(String[] args) {
		int[] a = {1, 3, 5, 7, 9}; // 선언과 대입을 한번에 new int 생략가능
		int[] b = new int[] {1,2,3}; // new int 생략ㄱ능
	
		
		int[] c; // 타입 [] 변수명 : 배열 선언
		c = new int[] {1, 2, 3}; // 대입 , new int 생략 불가능
		System.out.println(c[1]); // 1번째 방 확인 자바는 0부터 시작
		
		
		double[] d = new double[3]; // 방이 3개인 배열 생성. 
		// System.out.println(d[3]); // 4번째인 방은 존재하지않음 오류 발생
		System.out.println(d[1]); // 방에 값을 넣지 않았으니 기본값인 0.0 출력
		
		char[] ch = new char[4];
		System.out.println(ch[1]); // char 기본형 " "
		
		boolean[] b1 = new boolean[2];
		System.out.println(b1[1]); // 논리형 기본형 false
		
		b1[0] = 3>2;  // 타입에 맞는 값 대입
	//	b1[1] = 3; // 타입에 맞지 않는 값 대입시 오류 
		System.out.println(b1[0]);

		
	}
}
