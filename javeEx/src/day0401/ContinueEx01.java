package day0401;

public class ContinueEx01 {
	public static void main(String[] args) {
/*		continue문 
 		반복문 안에서 continue를 만나면
 		이후 코드 실행하지않고 증감식으로 가서 for문 실행.
 		: 특정 조건에서 건너뛰어야 할 때 사용한다.
 		
*/
		int a;
		for(a=1; a<=3; a++) {
			if(a==3) {
				continue;
			}
			System.out.println(a);
		}
		System.out.println(a);
	}
}











