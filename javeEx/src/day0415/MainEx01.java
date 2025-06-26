package day0415;

interface Message {
	void send(String msg);
	
}
/*
1. 구현 클래스 정의  
class A implements Message { 
	public void send(String msg) { 구현부 완성 }
}
2. main() 에서 사용
	구현 객체를 생성 후 사용
*/
public class MainEx01 {
	public static void main(String[] args) {
		// 익명 구현 객체 생성
		Message message = new Message() {
			// 추상 메서드 구현 해야함
			public void send(String msg) {
				System.out.println("보낸 메세지 : "+msg);
			}
		};
		message.send("hello");
	}
	
}
