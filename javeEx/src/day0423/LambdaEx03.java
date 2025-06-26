package day0423;

@FunctionalInterface	// 함수형 인터페이스
interface Message{
	void send(String msg);
}

public class LambdaEx03 {
	public static void main(String[] args) {
		// 람다식으로 객체 구현
		// 람다식 (매개변수) -> {실행문;};
		Message m = (msg) -> {System.out.println(msg);};
		m.send("hello");
	}
}
