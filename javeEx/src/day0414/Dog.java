package day0414;

public class Dog extends Animal{
	Dog(){
		this.kind = "포유류입니다.";
	}
	void sound() {
		System.out.println("멍멍");
	}
}