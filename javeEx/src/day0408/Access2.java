package day0408;

public class Access2 {
	public 		static int a;  // 모든 접근 허용
	protected 	static int b;  // 같은 패키지 내, 상속 받은 클래스내에서 접근가능
				static int c;  // 같은 패키지 내에서만 접근 가능 
	private 	static int d;  // 같은 클래스 내에서만 접근 가능
}
