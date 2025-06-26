package day0403;

public class ArrayEx05 {
	public static void main(String[] args) {
		// 배열 생성
		int[] a = new int[3];
		
		// 대입
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		
		// 배열 생성 대입 한번에
		int[] b = {100, 200, 300};
		
		// 참조변수 : 주소 값 가짐
		System.out.println(a);  // a배열 주소
		System.out.println(b);  // b배열 주소
		
		// 대입
		a = b; // a가 참조하는 주소가 달라짐 : a와 b는 같은 배열을 가리킴
		System.out.println(a);
		System.out.println(b);
		
		a[0] = 77; // 주소가 같으니 값 변경시 그 주소를 참조하는 모든 값이 바뀜
		System.out.println(a[0]);
		System.out.println(b[0]);
	}
}
