package day0409;

class Tv {
	// 정적 변수
	static String brand = "samsung";
	static String model = "QLED";
	static String info;
	
	// 정적 초기화 블럭
	static {
		info = brand + "-" + model;
	}
}

public class StaticMain04 {
	public static void main(String[] args) {
		// 정적 변수 값 확인 : 클래스명.정적변수명
		System.out.println("Tv 정보 : "+Tv.info);

	}
}
