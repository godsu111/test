package day0326;

public class VarEx07 {
	public static void main(String[] args) {
		long var1 = 10; // 자바는 정수형 기본을 int로 처리함 
		long var2 = 20L; 
		// long var3 = 10000000000; int가 표현할 수 있는 범위에서 벗어나기때문에 오류가 뜸(최대 21억), 고로 식별자가 필요함
		long var3 = 10000000000L;  //식별자(L,l)사용, 그 중 대문자를 주로씀 알아보기 편하기때문에
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	
	}
}
