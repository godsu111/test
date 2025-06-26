package day0404;

public class AnimalMain {
	public static void main(String[] args) {
		// 객체생성 -> 클래스이름 변수명 = new 클래스();
		Animal ani = new Animal("sky", "cat",true,50);
		//변수 읽기. 참조변수.멤버변수 
		System.out.println(ani.area);
		System.out.println(ani); // 참조변수는 객체의 주소를 가지공ㅆ음
		
		// 객체의 변수 값 변경
		// 참조변수명.멤버변수 = 값; -> 타입에 맞게
	
		
	}
}
