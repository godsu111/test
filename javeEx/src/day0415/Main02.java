package day0415;
// ArrayIndexOutOfBoundsException
public class Main02 {
	public static void main(String[] args) {
		// 매개변수가 두개인 경우만 실행
		if( args.length == 2) {
			String str1 = args[0];
			String str2 = args[1];
			
			System.out.println("args[0] : "+str1);
			System.out.println("args[1] : "+str2);
		}
		else {
			// 예외 예방 처리
			System.out.println("[ 실행 방법 ]");
			System.out.println("ExceptionEx02");
		}
	}
}
