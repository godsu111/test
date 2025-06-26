package day0408;
// 4
public class Account {
	// 인스턴스 변수선언
	int balance;   // 잔액
	
	// 인스턴스 메서드 생성
	// 리턴타입 메서드명(매개변수){실현 코드}
	void accountInfo(int deposit) { // 입금 
		if(deposit>0) {
			balance += deposit; // 입금한 금액만큼 증가			
		}
		System.out.println("현재 잔액 : "+balance);
	}
}
