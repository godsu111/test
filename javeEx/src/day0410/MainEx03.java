package day0410;

class Parent {
	String name = "조상";
	
	void say() {
		System.out.println("조상의 say() 메서드 호출");
	}
}
class Child extends Parent{		// 상속
	// name 변수 , say() 메서드 상속 받음 
	String name = "자손";
	// say() 메서드를 오버라이딩 선언부 같고 구현부만 다르게
	void say() {
		System.out.println("자손이 오버라이딩 한 say() 메서드 호출");
	}
	
	void check() { 
		System.out.println("조상의 name 변수 : "+super.name);
		System.out.println("자손의 name 변수 : "+this.name);
		
		super.say();
		this.say();
	}
	
}

public class MainEx03 {
	public static void main(String[] args) {
		Child c = new Child(); // super() 자동 추가 
		c.check();

	}
}
