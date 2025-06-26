package day0411;

class A {}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}


public class MainEx01 {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		int a = 10;
		double dd = a; // 자동 변환 
		
		A a1 = b;	// B 객체가 A 타입으로 자동 변환 가능 
		A a2 = c; 	// C 객체가 A 타입으로 자동 변환 가능 
		A a3 = d; 	// D 객체가 A 타입으로 자동 변환 가능 ( D -> B -> A ) ( D -> A)
		A a4 = e;   // E 객체가 A 타입으로 자동 변환 가능 ( E -> C -> A ) ( E -> A )
	
		B b1 = d;   // D 객체가 B 타입으로 자동 변환 가능 ( D -> B )
		C c1 = e;   // E 객체가 C 타입으로 자동 변환 가능 ( E -> C ) 
		
//		B b2 = e; 	// E 는 B의 자손이 아님
//		C c2 = d;   // D 는 C의 자손이 아님
//		B b3 = c;   // C 는 B의 자손이 아님
	}
}
