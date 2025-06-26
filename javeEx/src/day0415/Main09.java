package day0415;
// throws 	: 예외 떠넘기기
public class Main09 {
	public static void main(String[] args) {
		try{methodC();
		}catch(ClassNotFoundException e){
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	// 메서드 선언부에 throws 사용! -> 메서드 호출하는 곳에서 반드시 처리해야 함 
	public static void methodC() throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String00");
	
	}
}
