package day0414;
/*	
	인터페이스 구현 클래스
		implements 인터페이스 구현
		모든 추상 메서드 구현(접근제어자 public)

*/
public class Audio implements RemoteControl {
	
	private int volume;
	
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if( volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 Audio의 볼륨: "+this.volume);
	}
	
}
