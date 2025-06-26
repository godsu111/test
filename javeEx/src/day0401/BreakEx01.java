package day0401;

public class BreakEx01 {
	public static void main(String[] args) {
/*		break문
 		break문을 만나면 그 지점에서 더이상	수행하지않고 조건문/반복문 빠져나온다.
*/
		int sum=0; //합
		int num=0; //반복하는 수 
		for(num=0; sum<100; num++) { // 합sum이 100보다 커지면 반복 중단
			sum+=num; // 91 num은 현재13 / 1~14 = 105
		}
		System.out.println("num : "+num); // 15
		System.out.println("sum : "+sum); // 105
		
		int s=0;
		for(int a=1; a<14; a++) {
			s+=a;
			
		}
		System.out.println(s);
	}
}
