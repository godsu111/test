package day0326;

public class VarEx02 {
	public static void main(String[] args) {
	
		short s1;
		s1 = 128;
		System.out.println("s1 = "+s1); 
		short s2 = 0;
		short s3 = -32000;
		// short s4 = 32768; 표현범위 벗어남
		System.out.println("s3 = " +s3);
		System.out.println("s2 = " +s2);
		System.out.println(s2+s3);
		}
}
