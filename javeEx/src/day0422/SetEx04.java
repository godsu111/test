package day0422;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// List -> Set(중복 제거) -> List 
public class SetEx04 {
	public static void main(String[] args) {
		// 중복 값이 있는 list 생성
		List<String> list = Arrays.asList("A","B","A","C","B","D","E","E","F"); // .add() .remove() 불가능 -> Arrays 배열이기 때문
		// size 변경 불가! : 배열이므로
		System.out.println("원본 list : "+list);
		
		// HashSet 객체 생성
		Set<String> set = new HashSet<String>(list);	// 중복 제거
		System.out.println("set 변환 : "+set);
		
		// List 객체 생성
		List<String> list2 = new ArrayList(set);
		System.out.println("중복이 제거된 list : "+list2);
	}
}
