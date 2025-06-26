package day0423;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
	커스텀 집계
	reduce()	: 직접 연산 규칙을 제공
*/
public class StreamEx10 {
	public static void main(String[] args) {
		
		List<String> result = Arrays.asList("apple","banana","cherry","grape","strawberry","melon")
			  .stream()
			  .filter(s->s.contains("a"))  	 // "a"를 가진 요소들을 추출
			  .collect(Collectors.toList()); // "a"를 가진 과일들 다시 list 로 수집
		
		System.out.println("완성 : "+result);
	}
}
