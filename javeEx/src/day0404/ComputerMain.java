package day0404;

public class ComputerMain {
	public static void main(String[] args) {
		// 객체 생성, 멤버변수 
		// 클래스타입 변수명 = new 클래스명();
		Computer pc = new Computer();
		
		// 객체의 변수 값 읽기
		// 멤버변수값 사용. 참조변수.멤버변수명
		System.out.println(pc.company); 
		System.out.println(pc.model);
		System.out.println(pc.color);
		System.out.println(pc.inch);
		
		// 객체의 변수 값 변경
		// 변수이름 = 값; -> 타입에 맞는 값
		// 참조변수.멤버변수명 = 값; -> 타입에 맞는 값
		pc.company = "Samsung";
		pc.model = "intel";
		pc.color = "black";
		pc.inch = 24;
		
		System.out.println(pc.company);
		System.out.println(pc.model);
		System.out.println(pc.color);
		System.out.println(pc.inch);
		
		// 참조변수는 = 객체의 주소를 가지고 있음
		System.out.println(pc);
	}
}
