package day0328;

public class IfEx02 {
	public static void main(String[] args) {
		int age = 10;
		int price = 0;
		int i = 10;
		if( age < 8) {
			price = 1000; 
		}
		if( age < 14) {
			price = 1500;
		}
		if( age < 20 || (i+=2) < 0) { /*or 1논리연산에서 앞 조건이 이미 true이기 때문에 
			뒤에 i+=2를 대입하지않고 넘어감 만약 앞 조건이 false면 뒤에 확인을 해야하니 i에 대입 */
			price = 2000;
		}
		System.out.println("요금은 "+price+"원 입니다");
		System.out.println(i);
	}
}
