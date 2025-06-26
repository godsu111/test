package day0414;
// abstract class : 객체 생성이 목적이 아님 상속만들 위해 만든 클래스
// 추상 메서드 		- 메서드가 할 일을 명시 : 메서드 선언 
// 구현 메서드 		- 하위 클래스에서 공통으로 사용하는 메서드 

// Computer - DeskTop - NoteBook
public class MainEx04 {
	public static void main(String[] args) {
//		Computer c = new Computer();	new 사용 불
//		Computer c = new NoteBook();	자손 클래스도 추상클래스이기에 new 사용 불가능
		Computer a = new DeskTop();
	}
}
