package day0423;

import java.util.List;
import java.util.function.Predicate;

/* 
	Predicate<T>  
		값을 받아 조건 검사할 때 사용 -> 리턴 존재(true / false)
		boolean test(T t)
		필터링, 유효성 검사 등 사용 됨
*/
public class LambdaEx06 {
	public static void main(String[] args) {
		// 람다식 형태 (매개변수) -> {실행문};
		Predicate<Integer> isEven = (n) -> n%2==0;
//		Predicate<Integer> isEven = (n) -> {return n%2==0;};

		boolean result1 = isEven.test(4);
		System.out.println("4는 짝수인가? : "+result1);
		
		boolean result2 = isEven.test(5);
		System.out.println("5는 짝수인가? : "+result2);
		
		// 스트림과 같이 사용됨
		List<Integer> nums = List.of(1,2,3,4,5);
		nums.stream()
			.filter(n -> n%2==0)
			.forEach(System.out::println);
	}
}
