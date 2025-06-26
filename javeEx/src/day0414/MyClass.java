package day0414;
// MyInterface(X,Y의 상속 받음)의 구현 클래스
public class MyClass implements MyInterface{

	@Override
	public void x() {
		System.out.println("x()");
	}

	@Override
	public void y() {
		System.out.println("y()");
	}

	@Override
	public void myMethod() {
		System.out.println("MyMethod()");
	}
	
}
