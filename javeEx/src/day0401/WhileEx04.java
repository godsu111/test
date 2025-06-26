package day0401;

public class WhileEx04 {
	public static void main(String[] args) {
		// 1~10까지 합 구하기
		// 반복하는 수 , 합
		int a = 1;
		int sum = 0;
		
		while(a<=10) {
			sum+=a;   // 1+2+3+4+...+10
			System.out.println("변하는 sum값 확인 : "+sum);
			a++;      // 위치 잘 확인!
		}
		System.out.println("1~10까지의 합 : "+sum);
	}
}
