package day0416;
/*
	System 클래스 
		시스템 관련 기능 : 시간, 종료,...
		currentMillis();	: 1/1000초 단위 , exit();

*/
public class SystemEx01 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
	
		for(int i=0; i<100000; i++) {
			
		}
		
		long end = System.currentTimeMillis();
		System.out.println("걸린 시간 : "+(end-start)+"ms" );
	}
}

















