package day0407;

public class ShoesMain {
	public static void main(String[] args) {
		// 객체 생성
		// 클래스타입 변수명 = new 클래스명();
		Shoes s1 = new Shoes();
		Shoes s2 = new Shoes();
		
		// 참조 변수 값 확인
		// new 연산자로 생성한 객체는 각각 다르다.
		System.out.println("s1 객체의 주소 : "+s1);
		System.out.println("s2 객체의 주소 : "+s2);
		
		// 참조 변수 값 비교
		System.out.println("s1 == s2 : "+(s1 == s2)); // false
		System.out.println("s1 != s2 : "+(s1 != s2)); // true
		
		// 참조 변수 값 대입
		s2 = s1; // 같은 타입 , 같은 주소를 참조하게 됨, s2의 주소는 jvm 쓰레기통행, 이때 값은 주소
		System.out.println("s1 객체의 주소 : "+s1);
		System.out.println("s2 객체의 주소 : "+s2);
		
		System.out.println("s1 == s2 : "+(s1 == s2)); // true
		System.out.println("s1 != s2 : "+(s1 != s2)); // false 
	}
}












