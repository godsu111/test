package day0408;

public class FriendMain {
	public static void main(String[] args) {
		// 객체 생성
		// 클래스타입 변수이름 = new 클래스명();
		Friend f = new Friend();
		
		// 인스턴스 멤버사용 = 참조변수.멤버변수 , 참초변수.(변수/메서드);
		// 인스턴스 메서드 호출
		// 1. printName1() 메서드 호출
		f.printName1("이지훈");
	
		// 2.Printname2() 값이 없기에 먼저 name(인스턴스 변수)에 값을 대입 후 메서드를 호출한다.
		f.name = "이상혁";
		f.printName2();
	}
}