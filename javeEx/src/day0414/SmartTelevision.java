package day0414;

public class SmartTelevision implements RemoteControl, Searchable{
	// 변수
	private int volume;
	
	// 메서드 
	public void turnOn() {
		System.out.println("스마트 티비를 켭니다.");
	}
	public void turnOff() {
		System.out.println("스마트 티비를 끕니다.");
	}
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 스마트 티비의 볼륨은 : "+this.volume);
	}
	public void search(String url) {
		System.out.println(url+" 을 검색합니다.");	
	}
}














