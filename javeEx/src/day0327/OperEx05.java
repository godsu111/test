package day0327;

public class OperEx05 {
	public static void main(String[] args) {
/* 
  오버플로우(Overflow)
  데이터가 저장할 수 있는 범위를 넘을 때 발생.
  변수의 최댓값을 넘거나 최소값을 밑도는 값이 대입될 때 발생.
  
 */
		byte b1 = 127; // byte 값의 최대값
		System.out.println(b1); // 127
		
		byte b2 = (byte)(b1+3); // -126
		System.out.println(b2);
		
		b1++;
		System.out.println(b1); // -128
		
		
		
	}
}
