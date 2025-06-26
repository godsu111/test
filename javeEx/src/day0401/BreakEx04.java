package day0401;

public class BreakEx04 {
	public static void main(String[] args) {
		// 중첩 for문 안의 break문
		int a,b;
		for(a=1; a<=5; a++) {
			for(b=1; b<=5; b++) {
				if(b==3) {
					break; // 가까운 for문을 종료시킨다.
				}
				System.out.println(a+" , " +b);
			}
		}
	}
}
