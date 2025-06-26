package day0414;
// Car = AICar = ManualCar
/*
	템플릿 메서드
		실행 순서가 정해진대로 진행 
*/
public class MainEx05 {
	public static void main(String[] args) {
		System.out.println("=====자율 주행하는 자동차=====");
		Car aiC = new AICar();
		aiC.run();
		
		System.out.println("=====사람이 운전하는 자동차=====");
		Car maC = new ManualCar();
		maC.run();
	}
}
