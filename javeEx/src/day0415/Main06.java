package day0415;
// ArithmeticException	: 수학 계산 예외
public class Main06 {
	public static void main(String[] args) {
		try {	// 예외가 발생할 수 있는 코드
			int result = 10/0;
		}
		catch(ArithmeticException e) {	// 예외 처리
			System.out.println("0으로 나눌 수 없습니다.");		
		}
		finally {	// 예외 발생 유무에 관계 없이 무조건 실행
			System.out.println("finally {}블록은 무조건 실행 됩니다.");
		}
	}
}
