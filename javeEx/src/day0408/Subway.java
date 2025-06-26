package day0408;

public class Subway {	// 지하철
	// 인스턴스 변수
	String lineNumber;	// 지하철 노선 번호
	int passengerCount; // 지하철 승객 수
	int money; 			// 지하철 수입
	
	// 생성자 
	Subway(String lineNumber){
		this.lineNumber=lineNumber;
	}
	
	// 인스턴스 메서드
	// 메서드명(매개변수){실행코드}
	void take(int money) {		// 요금 받음
		this.money+=money;		// 수입 증가
		passengerCount++;		// 승객 증가
	}
	
	// 지하철 정보 출력
	void subwayInfo() {
		System.out.println(lineNumber+"의 승객은"+passengerCount+" 명 이고, 수입은 "+money+"원 입니다.");
	}
}
