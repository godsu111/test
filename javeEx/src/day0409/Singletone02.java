package day0409;

class School{
	// 변수 : 자기 자신의 객체를 담을 변수
	private static School instance;
	
	// 생성자 : 외부에서 생성 불가능
	private School() {}
	
	// 메서드 : 외부에서 객체를 사용하게 하는 메서드 
	public static School getSchool() {
		if (instance == null) {
			instance = new School();
		}
		
		return instance;
	}
	
}

public class Singletone02 {
	public static void main(String[] args) {
//		new.School();		
		School s = School.getSchool();
		School s2 = School.getSchool();
		
		System.out.println(s == s2);
	}
}
