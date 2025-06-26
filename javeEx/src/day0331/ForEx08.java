package day0331;

public class ForEx08 {
	public static void main(String[] args) {
		// 5*5
		int a;
		int b;
		for(a=1; a<=5; a++) {     // 세로 5줄 출력
			for(b=1; b<=5; b++) { // 가로 별5개 출력
				System.out.print("*");				
			}
			System.out.println(); // 줄바꿈	
		}			
	}
}

