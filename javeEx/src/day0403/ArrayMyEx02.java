package day0403;

public class ArrayMyEx02 {
	public static void main(String[] args) {
		int[] a = new int[3];   // 선언하고 방의 개수만 지정
		int[] b = {100, 200, 300}; // 선언과 동시에 값 지정 이렇게하면 new int, 방 개수입력 생략가능
		a=b; // a와 b가 같은 배열을 가리킴 
		
		System.out.println(a[0]); // a[0] = b[0] 같아짐
		
		a[0] = 77;
		System.out.println(b[0]);
		
		String[] str = {"apple", "kiwi", "melon"};
		String[] str2 = new String[3];
		str2 [0] = "apple";
		str2 [1] = "kiwi";
		str2 [2] = "melon";
		
		
//배열이 가지고 있는 변수를 편리하게 호출하기 위해 반복문과 사용 length=길이,크기,개수 등을 의미
// for문 for(초기식; 조건식; 증감식) {실행문;}
		for(int aa=0; aa<str2.length; aa++) { // str2 방의 개수보다 적게 반복
			System.out.println(str2[aa]);
		}
// foreach for(자료형 변수명 : 반복대상 ) {실행문}
		for(String s : str2) {
			System.out.println(s);
		}
	}
}
