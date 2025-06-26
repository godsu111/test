package day0415;
// 기본적인 try-catch문 사용
public class Main05 {
	public static void main(String[] args) {
		try {
			// 예외가 발생할 코드
			Class c = Class.forName("java.util.Scanner00");
		} 
		catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");// 예외처리
		}
	}
}
