package day0423;
/*
	람다식
		(매개변수) -> {실행문;};
*/
// 매개변수, 리턴이 있을 때
interface Calculator{
	int calc(int x, int y); // 추상 메서드 1개
}
public class LambdaEx02 {
	public static void main(String[] args) {
		// () -> {}
		Calculator add = (x, y) -> {return x+y;};
		
		// 실행문이 1개인 경우, {}와 return 생략 가능
		Calculator minus = (x,y) -> x-y;	
		
		// 실행문이 2줄 이상인 경우, {}와 return 작성해야함
		Calculator multi = (a,b) -> {	// 매개변수의 이름 상관 없음
			int result = a * b;
			return result;
		};
		int result1 = add.calc(3, 4);
		int result2 = minus.calc(5, 2);
		System.out.println("3+4 : "+result1);
		System.out.println("5-2 : "+result2);
		System.out.println("a*b : "+multi.calc(10, 6));
	}
}
