package day0423;

import java.util.function.BiFunction;

/*
	메서드 참조
		람다식으로 기존 메서드만 호출하는 경우
	클래스명::정적메서드		정적메서드 참조			Math::max
	참조변수::인스턴스메서드 	참조객체의 메서드 참조		str::length
	클래스명::인스턴스메서드 	매개값의 메서드 참조		String::length
	클래스명::new 			생성자 참조				ArrayList::new

*/
public class LambdaEx07 {
	public static void main(String[] args) {
		// BiFunction<입력값1, 입력값2, 리턴>
		BiFunction<Integer,Integer,Integer> max = Math::max;
		
		Integer result = max.apply(10, 20);
		System.out.println("10과 20중 최댓값 : "+result);
	}
	
}
