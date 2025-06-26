package day0326;

public class VarEx10 {
	public static void main(String[] args) {
		// 강제 타입 변환 () 캐스팅 연산자 
		// 큰 타입 -> 작은 타입 대입
		// 변환 '하려는' 타입 명시
		int a = 65; 
		char b = (char)a; // A=65 a=97 0=48
		System.out.println(b);
		System.out.println(a);
		
		// 실수 > 정수 
		double x = 10.5;
		int y = (int)x; // 0.5의 정보의 손실 발생, 강제 형변환
		System.out.println(y); // 10 출력
		System.out.println(x); 
		double z = y;
		System.out.println(z); // 손실된 값은 돌아오지 않는다.
		
		// 서로 다른 타입끼리의 변환 : 생략 X
		// 변환(대입)하려는 쪽의 타입을 반드시 적어라 
		
		double r = 3.15;
		byte cc = (byte)r;
		System.out.println(cc);
	}
}











