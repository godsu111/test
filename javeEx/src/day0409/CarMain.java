package day0409;
// 변수 private , 메서드(set() / get() public 
class Car{
	// 변수, 생성자, 메서드
	private int speed;
	private boolean stop;
	
	// 리턴타입 메서드명(매개변수, ...){구현 코드}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}
		else {
			this.speed = speed;			
		}
	}
	public int getSpeed() {
		return speed;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		// 차가 멈추면 속도를 0으로 변경
		if ( stop ) {
			this.speed = 0;
		}
	}
	// 차가 멈췄는지 확인
	public boolean isStop() { // boolean 타입일때 get이 아니라 is
		return stop;
	}
	
}

public class CarMain {
	public static void main(String[] args) {
		// 객체 생성
		Car c = new Car();
//		c.speed = 60;		private = 같은 클래스 내에서 접근 가능
		
		// 속도 값 설정, 속도 값 확인
		c.setSpeed(-50);
		int cSpeed =c.getSpeed();
		System.out.println(cSpeed);
		System.out.println("현재 속도 : "+c.getSpeed());
		
		c.setSpeed(100);
		int cSpeed1 = c.getSpeed();
		System.out.println("현재 속도 : "+cSpeed1);
		
		// 멈추지 않았다면 멈추게 ...
		if( !c.isStop()) {
			c.setStop(true);	// stop = true -> speed = 0; 
		}
		
		int cSpeed2 = c.getSpeed();
		System.out.println("현재 속도 : "+cSpeed2);
		
	}
}
 