package day0326;

public class VarEx03 {
	public static void main(String[] args) {
		// char 타입
		// 'A' -> 65, 'a' -> 97, '0' -> 48, '1' -> 49
		char c1 = 'A';
		char c2 = 'a';
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2); // 문자 출력
		char c3 = 66; // 정수 값 대입
		System.out.println("c3 = "+c3); //정수 값에 해당하는 문자 출력
		char c4 = 'b';
		System.out.println("c4 = "+c4);
		System.out.println("int 타입으로 바꾼 변수 c4 = "+(int)c4); 
		// 정수로 나옴 , 형변환 캐스팅 연산자()사용
		//char c4 = 'b';이면 문자열인 b가 출력이 되어야하는데 강제캐스팅(int)c4를 통해 문자에 맞는 숫자열로 바꿈
		int c5 = c4;
		System.out.println("c5 = "+c5);
	}
	
}

