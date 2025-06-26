package day0402;

public class MyBitEx02 {
	public static void main(String[] args) {
		int a = 35;
		int result = a << 2;
		System.out.println("a << 2 = "+result);
		
		int result2 = a >> 3;
		System.out.println("a >> 3 = "+result2);
	}
}
/*
1. 35를 2진수로 변환 32 16 8 4 2 1 -> 1 0 0 0 1 1
2.    100011 왼쪽으로 2칸이동
3.  100011  
4.빈칸은 0으로 채워줌 10001100
5. 10진수로 변환 128 64 32 16 8 4 2 1 -> 128+8+4 = 140

1. 100011 오른쪽으로 3칸이동
2.    100011 
3. 벗어난 만큼 삭제 100
4. 10진수로 변환 8 4 2 1 -> 4


*/ 
