package day0408;

public class Bus {	// 버스
	// 인스턴스 변수
	int busNumber; 	    // 버스번호
	int passengerCount; // 승객수
	int money;			// 버스의 수입
	
	// 생성자
	// 클래스(매개변수,...){객체의 초기화 코드}
	Bus(int busNumber){
		this.busNumber=busNumber;
	}
	
	// 인스턴스 메서드
	// 리턴타입 메서드명(매개변수,...){실행코드}
	
	// 승객이 버스에 탄 경우 
	void take(int money) {	// 요금 받기 
		this.money+=money;	// 버스 수입 증가
		passengerCount++;	// 승객 증가
	}
	
	// 버스 정보 출력
	void busInfo() {
		System.out.println(busNumber+"번 버스의 승객은 "+passengerCount+"명 이고, 수입은 "+money+"원 입니다.");
	}
}
