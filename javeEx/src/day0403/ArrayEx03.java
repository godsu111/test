package day0403;

public class ArrayEx03 {
	public static void main(String[] args) {
		// 배열 선언 : 타입[] 이름 
		int[] a = new int[5]; // 방의 개수 지정
		
		// 배열 사용
		// 인덱스[] : 배열 요소가 저장된 메모리의 위치를 찾아주는 역할
		// 배열 순서는 0부터 시작
		
		// 값 대입
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		// 값 읽기/사용
		System.out.println(a[0]); // 0부터 시작
		System.out.println(a[1]); // 선언 시 [] 변수이름 앞에 사용 : int[] a
		System.out.println(a[2]); // 사용시에는 반드시 []가 변수이름 뒤에 사용 : 변수[]
		System.out.println(a[3]);
		System.out.println(a[4]);
		// System.out.println(a[5]); // 5번째 방 확인 -> 오류 방이 4개밖에없으니
		
		// 배열 변수가 가지는 값 = 주소
		System.out.println(a);
		
		int[] b = new int[3];
		System.out.println(b);
		
		double[] d = new double[3];
		System.out.println(d);
		System.out.println(d[2]); // 방에 값이 없으니 기본값인 0.0 출력
		
		boolean[] l = new boolean[2];
		System.out.println(l);
		System.out.println(l[1]); // 값이 없으니 boolean 배열의 기본값인 false 출력
	}
}
