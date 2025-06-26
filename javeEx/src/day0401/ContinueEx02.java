package day0401;

public class ContinueEx02 {
	public static void main(String[] args) {
		// 1~100까지중 짝수만 출력
		for(int a=1; a<=100; a++) {  // 1~100까지 반복
			if(a%2!=0) { //짝수가아니다.
				continue; // 출력문 x 증감식으로 
			}
			System.out.println("짝수 - "+a);
		}
	}
}
