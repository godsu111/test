package day0408;

public class CarMain {
	public static void main(String[] args) {
		// 객체 생성
		// 클래스타입 변수명 = new 클래스명();
		Car c = new Car(); // gas 는 int 기본값인 0으로 초기화
		
		// 참조변수.메서드
		// 1. 가스 충전
		c.setGas(10);
		// 2. if(가스 있음?){ 출발 }
		
		// isGas() 의 결과로 true일 경우 if문 내부 실행
		if( c.isGas() ) { // 가스 있다
			System.out.println("출발~~");
			c.run();
		}
		// 가스없으면
		System.out.println("가스를 넣어주세요");
	}
}
