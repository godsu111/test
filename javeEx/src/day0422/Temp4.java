package day0422;

import java.util.Arrays;
import java.util.List;
import java.util.*;
public class Temp4 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A","B","A","C","B","D","E","E","F");
		
		Set<String> tt = new TreeSet(); // List -> Set 으로 변환 
		for(String s: list) {
			tt.add(s);
		}
		System.out.println(tt); 
		System.out.println(tt.size());
		
	}
}

/*
set은 index정보가 없기때문에 get으로 값을 꺼낼수 없기때문에 값을 꺼내기 위해선
1. 향상된 for문 사용
2. Iterator 사용 해야함 



*/
