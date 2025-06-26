package day0401;

public class ContinueEx05 {
	public static void main(String[] args) {
		// label : 이름 붙임
		a:for(int i=0; i<5; i++) {
			for(int x=0; x<5; x++) {
				if( x == 2) {
					continue a; // 이름붙인 for 문으로 감 가장 가까운 for 문이 아니라
				}
				System.out.println(i+" , "+x);
			}
		}
		int x,y;
		aa:for(x=0; x<5; x++) {
			for(y=0; y<5; y++) {
				if(y==2) {
					break aa;
				}
				System.out.println(x+" , "+y);
			}
		}
	}
}
