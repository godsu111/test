package day0403;

public class ArrayMyEx04 {
	public static void main(String[] args) {
		//배열 안의 값 합 구하기
		int[] a = {10,20,30,40};
		
		int sum = 0; // 합을 담을 그릇
		for(int b=0; b<a.length; b++) { // a[0] a[1]값을 저장해야하니 a[b]
			sum +=a[b];
		}
		System.out.println("for문의 합 : "+sum);
		
		//foreach문을 응용
		sum=0;
		for(int b : a) {
			sum += b;
		}
		System.out.println(sum);
	}
}
