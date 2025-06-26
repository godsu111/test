package day0403;

public class ArrayEx01 {
	public static void main(String[] args) { // String[] 배열 args(인수)
		// 배열 생성
		int[] a = new int[5]; // int 타입 값 5개가 들어갈 a라는 배열
		
		// 생성만하고 값을 지정하지 않았을 때 기본값으로 초기화가 됨.
		// 정수형 : 0 , 실수형 : 0.0 , 논리형 : false, 참초타입 : null
		System.out.println(a[0]);
		System.out.println(3+"ava");
	}
}
/*
	null
 	  - 참조타입 변수 : 객체의 주소를 참조한다
 	  - 참조 변수가 어떤 객체도 가리키지 않고 있다는 의미.
 	  - 아직 주소를 가지고 있지 않다는 의미 -> 참조하고 있는 것이 없다.
 	  - 특별한 값 : 실제 데이터를 의미하는 것은 아님.
 	  - 값이 없음을 나타냄
*/


