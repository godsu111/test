package day0403;

public class ArrayMyEx06 {
	public static void main(String[] args) {
		int[] numbers = {10, 33, 44, 60, 90, 101};
		
		//최댓값 구하기
		int max = numbers[0];// max에 numbers의 0번쨰 값 대입
		for(int i=1; i<numbers.length; i++) { // 0번쨰값과 1번째값을 비교해서 크면 max에 대입
			if(numbers[i]>max) {
				max = numbers[i];
			}
		}
		System.out.println("최댓값은 : "+max);
	}
}
