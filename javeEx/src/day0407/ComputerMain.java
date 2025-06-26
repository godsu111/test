package day0407;

public class ComputerMain {
	public static void main(String[] args) {
		// 객체 생성
		// 클래스타입 참조변수명 = new 클래스명();
		Computer c1 = new Computer("intel");
		
		// 멤버변수 사용 - 참조변수.멤버변수		
		System.out.println("c1의 제조사 : "+c1.company);
		
		// 객체 생성
		// 매개변수가 2개인 생성자 
		Computer c2 = new Computer("APPLE", "M4 pro");
		
		System.out.println("c2의 제조사 : "+c2.company);
		System.out.println("c2의 모델 : "+c2.model);	
		
		// 매개변수가 3개인 생성자
		Computer c3 = new Computer("APPLE", "macbook", "black");
		
		System.out.println("c3의 제조사 : "+c3.company);
		System.out.println("c3의 모델 : "+c3.model);
		System.out.println("c3의 색상 : "+c3.color);
		
		// 매개 변수가 4개인 생성자
		Computer c4 = new Computer("Samsung","Galaxy book4","white", 24);
		
		System.out.println("c4의 제조사 : "+c4.company);
		System.out.println("c4의 모델 : "+c4.model);
		System.out.println("c4의 색상 : "+c4.color);
		System.out.println("c4의 인치 : "+c4.inch);
	}
}







