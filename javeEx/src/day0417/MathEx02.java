package day0417;

import java.util.*;
// 로또 만들기
public class MathEx02 {
	public static void main(String[] args) {
		Set<Integer> lotto = new TreeSet<Integer>();
		
		while( lotto.size() < 6) {
			int num =(int)(Math.random()*45)+1;
			lotto.add(num);
		}
		System.out.println("이번주 로또 번호 : "+lotto);
		
	}
}














