package day0327;

public class IfEx03 {
	public static void main(String[] args) {
		int age = 12;
		int price;
		if( age<8 ) {
			price = 1000;
			System.out.println(price+"원 이고, 미취학 아동입니다.");
		}
		if( age<14) {
			price = 2000;
			System.out.println(price+"원 이고, 초등학생입니다.");
		}
		if( age<20) {
			price = 2500;
			System.out.println(price+"원 이고, 중고등학생입니다.");
		}else {
			price = 3000;
			System.out.println(price+"원 이고, 성인입니다.");
		}
		System.out.println("요금은 "+ price + "입니다.");
	}
}
