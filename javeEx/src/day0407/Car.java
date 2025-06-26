package day0407;

public class Car {
	// 변수
	String company;
	String model;
	String color;
	int speed;
	
	// 생성자
	// this() 호출하여 만들어보기

	Car(String company, String model, String color, int speed){
		this.company=company;
		this.model=model;
		this.color=color;
		this.speed=speed;
	}
	
	Car(String company){
		this(company, null, null, 0);
	}
	
	Car(String company, String model){
		this(company, model, null, 0);
	}
	
	Car(String company, String model, String color){
		this(company, model, color, 0);
	}
	Car(String model, String color, int speed){
		this(null, model, color, 0);
	}
	// 기본생성자
	Car(){
		// 매개변수가 없는 생성자
	}
}
/*
	다른 생성자 있는 경우 기본 생성자 사용 불가
	기본 생성자를 사용하고 싶다면 기본생성자를 만들면된다.
	
	Car(){}
*/