package day0402;

public class MyBitEx01 {
	public static void main(String[] args) {
		int a = 31;
		int b= 7;
		System.out.println( a & b );
		System.out.println( a | b);
		System.out.println( a ^ b);
		System.out.println(~a);
	}
}

/* 1. 2진수로 변환한다. 31 = 16 8 4 2 1 / 1 1 1 1 1
/                    7 = 4 2 1      /     1 1 1
/   & -> 00111
    | -> 11111
    ^ -> 11000
    ~ -> ~a = -1(a+1)
   2. 2진수를 다시 10진수로 표현
    & = 7
    | = 31
    ^ = 24
    ! = -32  
*/