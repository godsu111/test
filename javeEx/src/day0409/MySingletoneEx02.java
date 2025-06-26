package day0409;

public class MySingletoneEx02 {
	public static void main(String[] args) {
		System.out.println(Car123.a); 	// public 모두 허용
		System.out.println(Car123.b);	// 같은 패키지	
		System.out.println(Car123.c);	// 같은 패키지
//		System.out.println(Car.d); 	// 다른 클래스라 X
	}
}
