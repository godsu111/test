package day0325;

public class VarEx03 {
	public static void main(String[] args) {
		int age;  // 변수 선언
		age = 10; // 값의 대입
		System.out.println(age);
		
		int level;
		// System.out.println(level); 변수의 값이 없으면 사용할 수 없다.
		// 선언과 대입도 한번에 가능 
		int num = 5;  // 최초의 값을 대입 : 초기화 
		System.out.println(num);
		
		System.out.println(age+num);
		
		int result = age+num;
		System.out.println(result);
		
	}

}

