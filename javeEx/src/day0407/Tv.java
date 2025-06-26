package day0407;
// 7 
public class Tv {
	// 변수
	// 변수 선언 동시에 초기화 => 모든 객체에 동일한 값 들어감
	String brand = "삼성";
	String model;
	String color;
	int inch;
	
	// 생성자 
	// 생성자 호출 : 가장 많은 매개변수를 가진 생성자를 만들고 this() 호출한다
	// 호출하지 않는 값은 타입의 기본값을 넣어준다. null, 0등 
	// 객체를 초기화하는 코드가 같을때 사용 가능
	Tv(String model){
		// 다른 생성자 호출
		this(model, null, 0);
		// this.model = model;
	}
	// 매개변수가 2개인 생성자
	Tv(String model, String color){
		this.model = model;
		this.color = color;
	}
	// 매개변수가 3개인 생성자
	Tv(String model, String color, int inch){
		this.model = model;
		this.color = color;
		this.inch = inch;
	}
}
/*
	생성자 오버로딩( Constructor Overloading )
		같은 클래스 내에 이름이 같은 생성자를 여러개 정의하는 것
		매개변수의 개수, 타입, 순서 중 하나라도 달라야한다.
		이때 초기화 코드가 중복 - > this() 사용!

	사용 이유
		- 객체 생성 시 다양한 방식으로 초기화할 수 있도록 하기 위함.
		- 같은 클래스지만 상황에 따라 필요한 정보가 다를 수 있음.
		
		
	* this. this()
		반드시 생성자 블럭{} 내에 첫줄에 위치해야함.














*/


















