package day0418;

public class Ex01 {}
/*
	컬렉션 프레임워크 (Collection Framework)
		java.util 패키지에서 가장 중요!
		컬렉션 인터페이스를 구현하는 클래스를 배울것임.
		모든 컬렉션 인터페이스, 구현 클래스는 Collection 인터페이스를 조상으로 두고 있음.
		배열의 단점을 보완하면서 3가지 나뉨 (List, Set, Map 인터페이스)
		
	배열 생성
		선언 / 선언 생성
		1. 선언 생성
		int[] arr = {1, 2, 3, 4, 5};
		
		2. 값 ㄴㄴ, 생성만
		이때, 방개수 지정!
		int[] arr2 = new int[5];
		
		3. 선언, 생성 따로
		int[] arr3;
		arr3 = new int[5];
		배열 요소 각각 초기화
		arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 3;
		...
		
	배열의 단점
		저장할 수 있는 객체의 수가 배열을 생성할 때 지정됨.	<-> 컬렉션 프레임워크는 정해지지 않음. 늘리고 줄이는게 가능
		객체 삭제할 때 해당 인덱스의 값이 비어있음.			<-> 뒤에서 당겨져서 채워짐.
		들어가는 값의 타입이 지정됨.					<-> 모든 타입 가능 (<E> : 제네릭으로 타입 지정 가능)
		
	
	List 인터페이스
		순서 유지 -> 인덱스 사용
		중복 허용
		구현 클래스	: ArrayList
		
	Set 인터페이스
		저장 순서 X
		중복 불가		-> 오류 X (덮어쓰기 함)
		구현 클래스	: HashSet, TreeSet(자동 정렬)
		
	Map 인터페이스
		Key-Value 쌍으로 저장	(k-v : 하나의 entry(엔트리))
		Key는 중복 불가 / Value는 중복 가능
		.put(K,V)  / .get(K)
		구현클래스		: HashMap, TreeMap(자동 정렬)
		
	그 외 컬렉션
		Stack
			후입선출
			Last In First Out	/ First In Last Out
			순서대로 쌓이지만 인덱스 사용 X
		
		Queue
			선입선출
			First In First Out
*/
