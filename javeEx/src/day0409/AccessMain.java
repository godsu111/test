package day0409;
/*
 	접근 제어자(Access Modifier)
 		외부에서의 접근 제한하는 역할 
 		클래스, 변수, 메서드, 생성자

 	종류
 		public 		모든 접근을 허용한다
 		protected	같은 패키지 내, 상속 관계에서 접근 가능
 		default		같은 패키지 내에서만 접근 가능		: 자리 비워두면 default 
 		private		같은 클래스 내에서만 접근 가능 
 */
public class AccessMain {
	public static void main(String[] args) {
		// 같은 패키지 내의 Access1 클래스
		
		System.out.println(Access1.a);
		System.out.println(Access1.b);
		System.out.println(Access1.c);
//		System.out.println(Access1.d); 같은 클래스내에서만 접근가능
		
		// 패키지가 다른 경우 풀네임 작성
		System.out.println(day0408.Access2.a);
//		System.out.println(day0408.Access2.b);	// 다른 패키지 / 같은 패키지 상속관계에서만 접근가능
//		System.out.println(day0408.Access2.c);	// 다른 패키지 / 같은 패키지내에서만 접근가능
//		System.out.println(day0408.Access2.d);	// 다른 클래스 / 같은 클래스내에서만 접근가능
	}
}
