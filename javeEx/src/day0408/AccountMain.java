package day0408;

public class AccountMain {
	public static void main(String[] args) {
		// 객체 생성
		// 클래스타입 변수명 = new 클래스명();
		Account acc = new Account();
		
		// 인스턴스 메서드 호출 = 참조변수.메서드();
		acc.accountInfo(1000);
		acc.accountInfo(10000);
		acc.accountInfo(-77777);
		acc.accountInfo(5500);
		// 타입에 맞는 값 넣기 -> 변수 사용 가능
		int i = 100000;
		acc.accountInfo(i);
	}
}
