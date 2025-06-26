package day0407;
// 실행 클래스 : 객체를 생성하고 그 객체를 사용하는 곳
public class CupMain {
	public static void main(String[] args) {
		// 객체 생성
		// 클래스타입 변수명 = new 클래스명();
		Cup c = new Cup();
		
		// 참조변수 값 확인 
		System.out.println(c);
		
		// 객체의 변수 사용 - 1. 읽기
		// 변수 초기화를 하지 않았을 경우 기본값으로 초기화 됨.
		// 정수형 : 0 , 실수형 : 0.0 , 논리형 : false  
		System.out.println(c.texture);
		System.out.println(c.color);
		System.out.println(c.size);
		System.out.println(c.shape);
		
		// 객체의 변수 사용 - 2. 값 변경
		c.size = 15;
		System.out.println("변경 후 값 : "+c.size);
		c.color = "blue";
		System.out.println("변경 후 값 : "+c.color);
		
		
	}
}
