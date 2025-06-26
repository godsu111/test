package day0415;
// NumberFormatException	: 문자열 -> 숫자 숫자로 변환할 수 없는 문자열이 들어왔을 때 발생
public class Main03 {
	public static void main(String[] args) {
		String str1 = "2000";
		String str2 = "5000a"; // 숫자형 아님 
		
		// 숫자로 변환
		int value1 = Integer.parseInt(str1);
		int value2 = Integer.parseInt(str2);	// 변환을 할 때 예외 발생
		int result = value1 + value2;
		System.out.println(str1+"+"+str2+"="+result);
		
	}
}
