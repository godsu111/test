package day0414;

public interface RemoteControl {
	// 상수 변수 
	// 컴파일러가 자동으로 public static final 붙여준다.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메서드
	// 선언부 : 리턴타입 메서드명(매개변수); 만 정의
	// 컴파일러가 자동으로 public abstract 붙여준다.
	void turnOn();
	void turnOff();
	void setVolume(int Volume);
	
	// 디폴트 메서드	: default 키워드! 
	// 구현부까지 정의된 메서드 제공		-> 객체 생성
	default void setMute( boolean mute ) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}
		else{
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 정적 메서드 		: static 키워드!
	// 객체 생성 없이 사용 가능 
	static void changeBattery() {
		System.out.println("건전지 교환");
	}
}
