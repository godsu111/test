package day0410;
/*
	상속(Ingeritance)
		변수, 메서드를 물려받음 	- 생성자는 메모리 X 
		1:1 단일 상속만 가능 	- 자손에게 조상은 하나만 가능 
		자손의 객체 생성 		- 조상 객체도 생성
*/
class A{
	int x = 10;
}
class B extends A{ // A 클래스 상속 B -> A
	int y = 20;	   // 인스턴스 변수
// 	int x = 10; 상속 받음
}
class C extends A{ // A 클래스 상속 C -> A
	int z = 30;
}
class D extends B{ // B 클래스 상속 D -> B, D -> A
	int i = 40;	   // 인스턴스 변수 -> 객체 생성	
}

public class MainEx01 {
	public static void main(String[] args) {
		// B가 가진 변수 출력
		B b = new B();	// B 객체만 생성한 것 같지만 A 객체도 생성됨. 자식 객체생성 <-> 부모도
		System.out.println(" B 자신의 변수 y : "+ b.y+", A에게 상속 받은 변수 x : "+b.x);
		
		// C가 가진 변수 출력
		C c = new C();
		System.out.println(" C 자신의 변수 z : "+c.z+", A에게 상속 받은 변수 x : "+c.x);
		
		// D가 가진 변수 출력
		D d = new D(); // D 객체 생성될 때 B 객체 생성, A도 생성 D -> B -> A , D -> A : 상속 
		System.out.println(" D 자신의 변수 i : "+d.i+", B에게 상속 받은 변수 y : "+d.y+", A에게 상속 받은 변수 x : "+d.x);
		
	}
}
