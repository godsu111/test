package day0327;

public class OperEx10 {
	public static void main(String[] args) {
		// 삼항 연산자 
		// 조건식 ? true 일때의 값 또는 조건식 : false 일때의 값 또는 조건식;
		// 조건식의 결과가 논리형으로 나오도록 구성해야함
		
		System.out.println( 10>0 ? 100 : -100 );
		System.out.println( 10<0 ? 'A' : "F");
		System.out.println( 10>0 ? 10+10 : 10-10 );
		
		int a = 10;
		System.out.println( a<0 ? "크다" : "작다" );
		
		String result = a<0 ? "t" : "f";
		System.out.println(result);
		
		int age = 85;
		String result2 = !(age>90) ? "가" : "나" ;
		System.out.println(result2); //가

		int score = 85; 
		char grade = score > 90 ? 'A' : score > 80? 'B' : 'C';
		System.out.println(grade);
		
		int b = a > 5 ? a > 10 ? 500 : 100 : 0; // true 일때의 자리찾기 [a > 10 ? 500 : 100] false 일때 [0]
		System.out.println(b); // 100
		
		int c = 10;
		String value = c > 0 ? "양수" : c==0 ? "0이다." : "음수";
		System.out.println(value);
	}
}









