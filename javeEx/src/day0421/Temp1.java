package day0421;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Temp1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); // 조상의 타입에 자식의 객체 대입 : 다형성 -> 제네릭<>으로 Int타입만 받을거임
		list.add(1);
		list.add(100);
		list.add(22);
		list.add(11);
		list.add(77);
		list.add(90);
		list.add(243);
		System.out.println(list);
		list.set(0, 12); // 0번 인덱스의 값을 12으로 변경
		System.out.println(list);
		list.remove(0); // 0번 인덱스 값 삭제 -> 뒤에 인덱스가 삭제된 인덱스 값을 채움, 당겨짐
		System.out.println(list);
		System.out.println(list.subList(1,4));	// 1번 인덱스 포함 4번 인덱스 미만까지
		List<Integer> list2 = new ArrayList<Integer>(list.subList(1, 4));
		System.out.println(list.equals(list2));
		System.out.println(list == list2);
		System.out.println(list.contains(list2)); // 단순 비교 
		System.out.println(list.containsAll(list2)); // 값을 하나하나 비교
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list2);
		System.out.println(list2);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		list.retainAll(list2); // 교집합 제외 삭제
		System.out.println(list);
		System.out.println(list2);
		System.out.println(list.containsAll(list2));
		System.out.println(list==list2); // 두 객체는 다르다 new로 생성


	}
}
