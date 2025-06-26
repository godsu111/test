package day0401;

public class WhileEx05 {
	public static void main(String[] args) {
		// 1~100까지 반복, 홀 수의 합
		int a=1;    // 반복하는 수 
		int sum=0;  // 홀 수의 합
		while(a<=100) {
			if(a%2 !=0) { // 2의 배수가 아니다(홀수)
				sum+=a;
			}
			a++;
		}
		System.out.println("1~100까지 수 중 홀 수의 합은 : "+sum);
		
		
		
		int b=1;
		int sum1=0;
		while(b<=100) {
			if(b%2==0) { //짝수
				sum1+=b;
			}
			b++;
		}
		System.out.println("1~100까지 수 중 짝 수의 합은 : "+sum1);
		
		int c=1;
		int sum2=0;
		int sum3=0;
		while(c<=100) {
			if(c%2 !=0) { //홀수
				sum2+=c;
			}
			else { //짝수
				sum3+=c;
			}
			c++;
		}
		System.out.println("1~100까지 수 중 홀 수의 합은 : "+sum2);
		System.out.println("1~100까지 수 중 짝 수의 합은 : "+sum3);
	}
}
