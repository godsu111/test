package day0404;

public class CarMain {
	public static void main(String[] args) {
		// 객체 생성
		Car c = new Car();
		
		// 변수 사용(읽기)
		// 참조변수.멤버변수
		System.out.println("c의 제조사 : "+c.company);
		System.out.println("c의 주행 유무 : "+c.run);
		System.out.println("c의 최대 속도 : "+c.maxSpeed);
		System.out.println("c의 차 종 : "+c.model);
		System.out.println("c의 색상 : "+c.color);
		
		// 변수 값 변경
		c.company = "Hundai";
		c.run = false;
		c.maxSpeed = 320;
		c.model = "G90";
		c.color = "black";
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1.company);
		System.out.println(c2.company);
		
		c2.company = "KIA"; // 변수의 값은 달라질수있다.
		System.out.println(c1.company);
		System.out.println(c2.company);
	}
}
