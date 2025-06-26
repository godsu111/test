package day0326;

public class VarEx01 {
	public static void main(String[] args) {
		byte b1 = -128;
		byte b2 = -30;
		byte b3 = 0;
		byte b4 = 30;
		byte b5 = 127;		
		
		//byte b6 = -129;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
	}
}
/* 기본 데이터 타입 (8개)
   정수형-5 
   		byte  : -128 ~ 127
   		short : -32,000 ~32,000
   		char  : 0 ~ 65,000 (유니코드 값 저장)
   				반드시 ' '(작은따옴표)사용 예 char c = 'a'; -> 97
   				하나의 문자를 저장하는 타입
   				문자를 숫자로 저장, 출력시 문자로 변환
   		*int  : -21억 ~ 21억 [기본형]
   		long  : -2의 63제곱 ~ 2의 63제곱-1
   실수형-2 (최소 한자리의 소수점을 갖는다) 
   		float : 소수점 약 7자리  
   		*double : 소수점 약 16자리 표현 [기본형]
   논리형-1 
   		boolean : true/false
   
   참조 타입
   문자열
   		String : ""(큰따옴표)사용
   				공백도 문자취급   
 */































