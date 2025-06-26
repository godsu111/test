package day0414;

public class Television implements RemoteControl{
	// 변수
	private int volume;
	
	// 추상 메서드 구현
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
	}
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	} 
	public void setVolume(int volume) { // 인터페이스의 상수변수 사용
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : "+this.volume);
	}
}

/*
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tunrOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int Volume) {
		// TODO Auto-generated method stub
	}
 */		