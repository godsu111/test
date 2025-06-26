package day0415;

public class Main07 {
	public static void main(String[] args) {
		String str1 = null;
		String str2 = null;
		
		try {
		str1 = args[0];	// 인덱스 예외 발생 가능
		str2 = args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("매개값이 부족합니다.");
			return;
		}
		
		try {
			int var1 = Integer.parseInt(str1);
			int var2 = Integer.parseInt(str2);
			int result = var1+var2;
			System.out.println(var1+"+"+var2+"="+result);
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환이 불가한 값 입니다.");
		}finally {
			System.out.println("다시 실행하세요!");
		}
	}
}
