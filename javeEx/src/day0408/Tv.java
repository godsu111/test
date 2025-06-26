package day0408;

public class Tv {
	// 변수
	int channel;   // 채널
	boolean power; // 전원(on-true,off-false)
	
	// 메서드
	// 리턴타입 메서드명 (매개변수,..){실행코드}
	
	// tv 전원을 켜고 끄는 기능
	void power() {
		power = !power;
		System.out.println("Tv 전원의 현재 상태 : "+power);
	}
	// tv 채널 올리는 기능
	void channelUp() {
		++channel;
	}
	// tv 채널 내리는 기능
	void channelDown() {
		--channel;
	}
}
