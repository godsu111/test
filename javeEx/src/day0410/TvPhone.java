package day0410;
//MainEx05 에서 실행
public class TvPhone extends Phone {	// 자손 클래스
	int channel;
	
	TvPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void powerOn(){
		System.out.println("채널 "+channel+"번 시청을 시작합니다.");
	}
	void powerOff() {
		System.out.println("Tv 시청을 멈춥니다.");
	}
	void changeChannel(int channel) {
		this.channel=channel;
		System.out.println("채널을 "+channel+"번으로 변경합니다.");
	}
}
