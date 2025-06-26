package day0409;
/*
	static	- 객체 생성 없이 사용 가능
	final	- 변경이 불가능하다. 값 고정
	관례) 변수명 모두 대문자, 띄어쓰기 _사용 -> MAX_COUNT, ...
*/
class SF {	// static final 같이 사용할 때 순서 상관 X
	static final double PI = 3.141592;
	final static int MAX_VALUE = 10000;
}

public class StaticFinal01 {
	public static void main(String[] args) {
		// 정적 인스턴스변수 호출 클래스.변수명
		System.out.println(SF.PI);
		System.out.println(SF.MAX_VALUE);
	}
}
