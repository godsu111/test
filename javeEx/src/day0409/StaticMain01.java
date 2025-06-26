package day0409;

public class StaticMain01 {
	public static void main(String[] args){
		// 정적 메서드 호출		- 객체 생성 없이 사용 가능: 클래스명.메서드()
		int result = StaticEx01.add(10, 20);
		System.out.println("static메서드() 결과 : "+result);

		// 인스턴스 메서드 호출	- 객체 생성 해야함 : 참조변수.메서드();
		// 객체 생성
		// 클래스타입.변수이름 = new 클래스명(); 
		StaticEx01 st = new StaticEx01(); // 기본생성자
		int result1 =st.minus(10, 5);
		System.out.println("인스턴스 메서드() 결과 : "+result1);
	}
}
