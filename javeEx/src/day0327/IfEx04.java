package day0327;

public class IfEx04 {
	public static void main(String[] args) {
/*
    if-else if-else문 
    하나의 상황에 조건이 여러개인 경우 사용한다.
    하나의 조건에 만족하면 이후의 조건은 비교하지 않는다.
 */
		int age =12;
		int price;
		if( age < 8) {
			price = 1000;
			System.out.println("미취학아동입니다.");
		}else if( age < 14 ){
			price = 2000;
			System.out.println("초등학생입니다.");
		}else if( age < 20 ) {
			price = 2500;
			System.out.println("중고등학생입니다.");
		}else { // 써도 되고 안써도 된다. 다만 쓰려면 위치는 문법상 제일 마지막.
			price = 3000;
			System.out.println("성인입니다");
		}
		System.out.println("요금은 "+price+"입니다.");
		
	}
}











