package day0402;

public class Test01 {
	public static void main(String[] args) {
		//02. 구구단을 짝수 단만 출력하는 코드를 작성해보세요.
		//힌트) continue문 사용
		
		int dan;  // 구구단의 단
		int i;    // 반복되는 수
		
		for(dan=2; dan<=9; dan++) {
			if(dan%2!=0) { // 홀수
				continue;
			}
			for(i=1; i<=9; i++) {			
				System.out.println(dan+" * "+i+" = "+dan*i);
			}
			System.out.println();
		}
	}
}
