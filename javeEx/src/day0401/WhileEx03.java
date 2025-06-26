package day0401;

public class WhileEx03 {
	public static void main(String[] args) {
		// 10부터 감소 
		
		int a=10;
		while(a>=0) {
			System.out.println(a);
			a--;
		}
		
		// 100부터 감소 홀수 출력
		
		int b=100;
		while(b>=1) {
			if(b%2 !=0) {
				System.out.println(b);
			}
			b--;
		}
		// 100부터 감소 짝수 출력
		int c=100;
		while(c>0) {
			if(c%2==0) {
				System.out.println(c);
			}
			c--;
		}
	}
}
/* 다른방법
int a = 100;
while(a>=1) {
	System.out.println(a-1);
	a-=2;
}

int b = 100;
while(b>0) {
	System.out.println(b);
	b-=2;
} */