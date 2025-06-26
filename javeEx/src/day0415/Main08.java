package day0415;
// catch의 다중 구성
public class Main08 {
	public static void main(String[] args) {
		try {
			String input = args[0];
			int number = Integer.parseInt(input);
			System.out.println("입력한 숫자 : "+number);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("입력값이 없습니다.");
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}catch(Exception e) {
			System.out.println("다른 예외 발생 : "+e.getMessage());
		}
	}
}
