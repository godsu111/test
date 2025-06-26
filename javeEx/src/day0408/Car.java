package day0408;

public class Car {
	// 인스턴스 변수
	int gas;	// 가스량
	
	// 인스턴스 메서드
	// 리턴타입 메서드명(매개변수,..){실행코드}
	// gas 값 넣기
	void setGas(int gas) {
		this.gas=gas;
	}
	
	// 가스가 있는지 없는지 확인하는 메서드 if( a.isEmpty() ){}
	boolean isGas(){ // 결과가 참/거짓으로 나오는 메서드 is
		if(gas == 0) {
			System.out.println("가스가 없습니다. ");
			return false;
		}
		System.out.println("가스가 있습니다. ");
		return true;
	}
	// 자동차가 달리는 메서드 
	void run() {
		while( true ) {
			if( gas>0 ) {
				System.out.println("자동차가 달립니다. gas량 : "+gas);
				gas--;
			}
			else {
				System.out.println("자동차가 멈춥니다. gas량 : "+gas);
				return; // 메서드의 종료
			}
		}
	}
}
