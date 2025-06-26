package day0402;

public class BitEx04 {
	public static void main(String[] args) {
		// 비트 이동 연산자(시프트 연산자)
		// << 왼쪽으로 이동 , >> 오른쪽으로 이동 
		
		int num = 5;
		int result = num << 2;
		System.out.println("num << 2 = "+result);
		
		// 5 -> 101
/*		101 
  	  101    -> 왼쪽으로 2칸 이동	
  	  10100  -> 빈자리 0 채워줌
  	  16+ 4 = 20
  
  
 */
		int num2=  10;   // 1010
		int result2 = num2 >> 2;
		System.out.println("num >> 2 = "+result2);
/* 
		1010
 		  1010 -> 오른쪽으로 2칸 이동 
 		  10   -> 넘친만큼삭제
 		0010   -> 2  
*/		
		// 10 << 3
/*      1010 
     1010000
     1010000 ->     
        // 5 >> 2
      101
        101 
      1->1  
 
 * */
		System.out.println(10<<3);
		System.out.println(5>>2);
	}
}
