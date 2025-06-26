package day0415;
// 중첩 인터페이스 
public class Nested08 {
	// 클래스 내부에 선언된 인터페이스 
	interface Click {
		void onClick(); // 추상 메서드
	}
	// 내부 클래스에서 인터페이스 구현
	class Button implements Click{
		public void onClick() {
			System.out.println("버튼을 클릭했습니다.");
		}
	}
	
	public static void main(String[] args) {
		// 외부 클래스 객체 생성
		Nested08 ne = new Nested08();
		// 내부 클래스 객체 생성 
		Nested08.Button button =ne.new Button();
		// 내부 클래스의 메서드 호출
		button.onClick();
	}
}
