package day0408;
// 5
public class Person {
	// 변수 생성자 메서드
	String name;     // 이름
	int personNum;   // 주민번호
	String address;  // 주소
	
	// 생성자
	// 클래스(매개변수, ..) {객체의 초기화코드}
	Person(String name, int personNum){
		this.name = name;  // 매개변수를 인스턴스 변수에 저장
		this.personNum = personNum;
	}
	// 메서드
	// 리턴타입 메서드명(매개변수, .. ){ 구현 코드 }
	
	// address에 값을 저장하는 메서드
	void setAddress(String address) { // set() 값 저장 <-> get() 값 꺼냄
		this.address = address;
	}
	// address에 값을 꺼내는 메서드
	String getAddress() { 
		return address;
	}
	// 모든 변수값 확인하는 메서드
	void showInfo() {
		System.out.println("이름 : "+name+", 주민번호 : "+personNum+", 주소 :"+address);
	}

}
