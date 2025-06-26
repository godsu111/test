package day0414;


// 계산기를 구현하기 위한 인터페이스 
public interface Calc {
	// 상수 변수	public static final 
	double PI = 3.14;		// 원주율
	int ERROR =  -9999999;	// 오류 발생 시 사용할 에러 변수
	
	// 추상 메서드 	public abstract
	int add(int num1, int num2);
	int minus(int num1, int num2);
	int multi(int num1, int num2);
	int divide(int num1, int num2);
		
	// default 메서드	default
	default void description() {
		System.out.println("정수 계산기를 구현!");
		myMethod();
	}
	
	// 정적 메서드 	static
	static int total(int[] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		myStaticMethod();
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 메서드() 입니다.");
	}
	private static void myStaticMethod() {
		System.out.println("private static 메서드() 입니다.");
	}
}
