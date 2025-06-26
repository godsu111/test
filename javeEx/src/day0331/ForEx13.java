package day0331;

public class ForEx13 {
	public static void main(String[] args) {
		// 1~30까지 숫자중 , 3의 배수만 출력
		for(int a=1; a<=30; a++) {
			if(a%3==0) {
				System.out.println(a);
			}
		}
	}
}
