package day0407;
// 6
public class Computer {
	// 객체 속성 - 회사, 모델, 색상, 인치 
	String company;
	String model;
	String color;
	int inch;
	
	
	// 생성자
	// 클래스명(매개변수,...){객체 초기화 코드}
/*	
	Computer(String c){
		company = c;
	}
	
	Computer(String c1, String m){
		company = c1;
		model = m;
	// 매개변수가 1개인 생성자
*/	Computer(String company){
		this.company = company;
	}
	// 매개변수가 2개인 생성자
	Computer(String company, String model){
		this.company = company;
		this.model = model;
	}
	// 매개변수가 3개인 생성자
	Computer(String company, String model, String color){
		// 생성자 호출 this();
		this(company, model, color, 0);
		
	}
	// 매개변수가 4개인 생성자
	Computer(String company, String model, String color, int inch){
		this.company = company;
		this.model = model;
		this.color = color;
		this.inch = inch;
		
	// Computer(String model){} 오류뜸 이미 String 타입을 썼기때문에 컴파일러가 같은 것으로 인식함 
	}
}
