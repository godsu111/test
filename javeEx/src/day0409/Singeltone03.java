package day0409;

class Phone {
	// 변수, 생성자, 메서드
	public int number = 12345;
	private static Phone p = new Phone();
	
	// 생성자
	private Phone() {}
	
	// 메서드 - 객체 제공
	public static Phone getPhone() {
		return p;
	}
}
public class Singeltone03 {
	public static void main(String[] args) {
		Phone p1 = Phone.getPhone();
		Phone p2 = Phone.getPhone();
		
		System.out.println(p1.number);
		System.out.println(p2.number);
		p1.number = 6789;
		System.out.println(p1.number);
		System.out.println(p2.number);
	}
}
