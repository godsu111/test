package day0410;

public class X {	// 상속 X
	public static void main(String[] args) {
	// 일반적인 객체 생성
		P p = new P();	// 같은 패키지에 존재하기 때문에 접근 가능
		p.var="hello";
		System.out.println("p 객체의 인스턴수 변수 : "+p.var);
		p.methodP();
	}
}