package day0408;

public class PersonMain {
	public static void main(String[] args) {
		// 객체 생성
		// 클래스타입 변수명 = new 클래스명(타입에 맞는 값, ...);
		Person p = new Person("이상혁",960504);
		
		// 인스턴스 변수 값 확인 => 참조변수.멤버변수
		System.out.println("p.name : "+p.name);
		System.out.println("p.personNum : "+p.personNum);
		
		// 메서드 호출 => 참조변수.메서드();
		// .get()호출
		p.getAddress();  // 호출한 곳으로 return 돌아옴.
		// 1. 변수 선언
		String address = p.getAddress();
		System.out.println("변수로 확인 : "+address);
		// 2. 출력문 안에 사용
		System.out.println("출력문 안에 사용 : "+p.getAddress());
		
		// 인스턴스 변수 사용 -> 참조변수.변수
		p.address = "서울시 관악구 남부순환로 에그옐로우 6층";
		System.out.println("값 대입 : "+p.address);
		
		// .set() 사용
		p.setAddress("에그옐로우 14층");
		String result = p.getAddress(); // 반환된 return 값을 대입
		System.out.println(result);
		
		p.showInfo();
	}
}












