package day0328;

public class SwitchEx01 {
	public static void main(String[] args) {
/*
 		Switch-case문
 		조건식의 결과 - > 변수 타입이 같다면
 		Switch문으로 만드는 것이 가독성이 좋다.
 		case : ~ break;까지가 조건에 해당한다.
 		일치하는 case가 없다면 default 코드를 수행한다.
 */
		String position = "과장";
		switch (position) {
			case "부장" : 
				System.out.println("700만원");
				break;
			case "과장" : 
				System.out.println("500만원");
				break;
			default :
				System.out.println("300만원");
		}
	}
}
