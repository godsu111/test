package day0408;

public class MessageMain {
	public static void main(String[] args) {
	// 객체(인스턴스)생성
    // 클래스타입 변수명 = new 클래스명();
	Message m = new Message();
	
	// 메서드 호출/사용
	// 인스턴스 멤버 사용 -> 참조변수.(변수/메서드)이름
	m.printMsg("hello");
	}
}
