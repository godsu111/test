package day0404;

public class PersonMain {
	public static void main(String[] args) {
		// 객체 생성
		// 클래스타입 변수명 = new 클래스이름();
		Person p1 = new Person();
		System.out.println("p1 변수가 Person이라는 객체 주소를 참조한다. ");
		
		Person p2 = new Person();
		System.out.println("p2 변수가 Person이라는 객체 주소를 참조한다. ");
		
		System.out.println("p1의 값 : "+p1);
		System.out.println("p2의 값 : "+p2);
		
		// 변수 p1, p2 모두 스택(Stack)영역에 생성. 
		// 변수 p1, p2 각각의 생성된 객체의 주소를 참조.
		// new 연산자로 생성된 객체는 각각 다르다. -> 주소 확인을 통해 알 수 있음.
	}
}
