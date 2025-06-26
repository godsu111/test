package day0414;

public class AICar extends Car  {
	void drive() {
		System.out.println("자율 주행 합니다.");
		System.out.println("자동차가 스스로 방향전환을 합니다.");
	}
	void stop() {
		System.out.println("스스로 멈춥니다.");		
	}
}
