package day0407;

public class CarMain {
	public static void main(String[] args) {
		Car c = new Car(); // 기본 생성자
		Car c1 = new Car("현대");
			System.out.println("c1.company : "+c1.company);
			System.out.println();
		
		Car c2 = new Car("현대","ST1");
			System.out.println("c2.company : "+c2.company);
			System.out.println("c2.model : "+c2.model);
			System.out.println();
		Car c3 = new Car("현대","Sonata","흰색");
			System.out.println("c3.company: "+c3.company);
			System.out.println("c3.model: "+c3.model);
			System.out.println("c3.color: "+c3.color);
			System.out.println();
		Car c4 = new Car("현대","Casper","검정",280);
			System.out.println("c4.company : "+c4.company);
			System.out.println("c4.model : "+c4.model);
			System.out.println("c4.color : "+c4.color);
			System.out.println("c4.speed : "+c4.speed);
			
		// 값 변경
		// 변수이름 = 값;
			c1.company = "기아";
			c2.company = "테슬라";
			c2.model = "modelS";
			c3.company = "기아";
			c3.model = "NIRO";
			c3.color = "검정";
			c4.company = "현대";
			
	}
}
