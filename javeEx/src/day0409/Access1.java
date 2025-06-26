package day0409;

public class Access1 {
	public 		static int a;	// 어디서든 접근이 가능하다
	protected 	static int b;	// 같은 패키지, 상속 관계에서 접근 가능
				static int c;	// 같은 패키지 내에서만 접근 가능
	private 	static int d;	// 같은 클래스 내에서만 접근 가능
}