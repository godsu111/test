package day0326;

public class VarEx08 {
	public static void main(String[] args) {
		// 실수형 float 32비트 < double(기본형) 64비트
		double d = 3.14;
		// float f = 3.12;
		float f = 3.12F; // 식별자(F,f) 사용
		System.out.println(d);
		System.out.println(f);
		double r = d+f;
		System.out.println(r);  // 표현할 수 있는 범위자체가 다르므로 실수에 계산에선 다른 타입끼리의 연산을 잘 하지않는다.
		char a = '\u1103';
		System.out.println(a);
	}
}
