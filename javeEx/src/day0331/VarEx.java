package day0331;

public class VarEx {
	public static void main(String[] args) {
/*  	지역변수 : 선언된 영역/블럭{} 안에서만 사용이 가능 = 블럭 밖 사용 불가능.
  				블럭{}이 종료되면 자동으로 삭제된다.
  
 
 		
 */
		int a =100; // main 안에서 선언
		if( a>10 ) {
			int x = 1000;  // if문 안에서 선언
			System.out.println(a);
			System.out.println(x);
		}// if 종료
		System.out.println(a);  // 가능
		// System.out.pritnln(x); if문 내에서만 사용가능하기 때문에. if문이 끝나면 삭제됨
	}
}
