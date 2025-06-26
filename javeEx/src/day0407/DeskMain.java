package day0407;

public class DeskMain {
	public static void main(String[] args) {
		// 객체 생성
		Desk d1 = new Desk();
		Desk d2 = new Desk();
		
		// 객체의 변수 값 확인
		// 참조변수.멤버변수명
		
		System.out.println("d1.brand : "+d1.brand);
		System.out.println("d2.brand : "+d2.brand);
		System.out.println("d1.size 기본값 : "+d1.size);
		System.out.println("d2.size 기본값 : "+d2.size);
		
		// 참조변수 대입
		d1 = d2; // 동일한 타입끼리는 대입이 가능. 주소 값 대입
		d2.size = 300;
		
		System.out.println("d1.size의 값 : "+d1.size);
		System.out.println("d2.size의 값 : "+d2.size);
	}
}


















