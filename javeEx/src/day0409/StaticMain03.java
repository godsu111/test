package day0409;
/*
  	정적(static) 초기화 블럭
  	    정적(static) 변수들을 초기화할 때 사용
 		
 		static {
 			// 초기화 코드
 		}
 */
class Static03{
	// static 변수
	static boolean power;
	static int channel;
	
	// 정적 초기화 블럭
	static {
		power = true;
		channel = 10;
	}
}
public class StaticMain03 {
	public static void main(String[] args) {
/*		static {
			System.out.println("static 블럭 실행 됨."); // 메인 메서드 안에서는 위치할 수 없다
		}  */
		
		// 정적 변수 사용 : 클래스명.정적변수명
		System.out.println(Static03.power);
		System.out.println(Static03.channel);
	}
}
