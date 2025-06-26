package day0331;

public class ForEx03 {
	public static void main(String[] args) {
		for( int a=1; a<=5; a++) {
			for( int x=1; x<=5; x++) {
				System.out.println(a+" - "+x);
			}
			for( int x=1; x<=5; x++) { //변수 x가 사용이 가능하다. 영역/{}블럭이 다르기 때문에
				System.out.println(a+" -- "+x);
			}
		}// a for문 종료
		System.out.println("====");
		
		int c,d; //타입이 같으므로 한번에 선언가능.
		for(c=1; c<=5; c++) {
			for(d=1; d<=5; d++) {
				System.out.println(c+" - "+d);
			}
			for(d=1; d<=5; d++) {
				System.out.println(c+" -- "+d);
			}
		}
		
	}	
}



























