package day0409;

class Person{
	// final 변수 초기화 방법
	// 1. 선언과 동시에 초기화
	// 2. 생성자를 이용해 초기화 
	final String NATION = "대한민국";  // 국가
	final String BIRTH;				 // 생년월일	
	String name;					 // 이름
	
	// 클래스명(매개변수,...){객체의 초기화 코드}
	Person(String birth,String name){
		this.BIRTH = birth;
		this.name = name;
	}
}
public class FinalEx02 {
	public static void main(String[] args) {
		Person p = new Person("1997.08.25","이경훈");
		System.out.println(p.NATION);
		System.out.println(p.BIRTH);
		System.out.println(p.name);
	
//		p.BIRTH = "20";
//		p.NATION = "아프리카";   // final 변수는 대입 불가
		p.name = "이상혁";      // 인스턴스 변수라 가능
	}
}
