package day0409;

public class Summary {}
/*
	패키지(package)
		자바에서클래스를 폴더처럼 묶는 구조
		관련된 클래스들을 그룹으로 관리, 이름 충돌 방지, 구조 정리

	import문
		다른 패키지에 있는 클래스를 사용할 때 편의 기능
		Java.lang 패키지 외의 패키지는 import 사용하는 것이 편함
		( String , System 등 )
		* 해당 패키지 안의 모든 클래스를 의미 Ex) Java.util.*;
	
	접근 제어자
	  	클래스, 변수, 생성자, 메서드의 접근 범위 설정
	  	지역변수에는 접근제어자 사용 불가
	  	클래스는 public, default 만 사용 가능
	  	
  	public		어디서든 접근 가능 				클래스, 변수, 생성자, 메서드
  	protected 	같은 패키지 또는 상속 관계		변수, 생성자, 메서드
  	default		같은 패키지 내에서만 접근 가능		클래스, 변수, 생성자, 메서드
  	private		같은 클래스 내에서만 접근 가능		변수, 생성자, 메서드
  	
  	
  	캡슐화 (Encapculation)
  		1. 클래스 내부의 변수를 외부에서 접근하지 못하게 하고,
  		   메서드를 통해서 간접적으로 접근하게 함
  		2. 데이터를 보호, 잘못된 사용 방지
  		
	정적 (static)
		클래스에 고정된 요소, 프로그램 시작과 동시에 메모리에 올라간다(사용 준비완료)
		객체 없이도 사용이 가능하다(객체 생성 X)
		사용 방법 : 클래스.변수명, 클래스.메서드명()
		
		
	정적 초기화 블럭
		static 변수 복잡한 초기화를 위해 사용
  		객체 생성 없이 실행
		
		static {
			// 최초 한번만 실행
		}
  		
  	싱글톤 패턴 (Singletone)	
  		하나의 어플리케이션 내에서 단 하나만 생성되는 객체
  		공통 설정, DB 연결 객체 등 하나만 있어야하는 객체에 사용
  		
  		변수, 생성자, 메서드
  		private static Singletone instance;
  		private Singletone(){}
  		public static Singletone getInstance(){
  			if( instance == null ){
  				instance = new Singletone();
  			}
  			return instance;
  		}
  		
	final
		최종/마지막의 의미
		클래스, 변수, 메서드 앞에 사용
		클래스	: 상속 불가
		변수		: 변경 불가 , 상수 변수 관례) 모두 대문자, 띄어쓰기는 _ 사용
		메서드 	: 자손 클래스에서 메서드의 오버라이딩이 불가능
		
	static final 	
		final static	순서 상관 없음
		모든 객체가 공유하면서 절대 바뀌지 않는 고정된 값( 공통 상수 )
		프로그램 전체에서 사용할 고정된 값으로 사용할 때
		Ex) public static final int MAX_COUNT = 100;
		
	final 변수			static final 변수
	객체마다 따로 존재		클래스 전체에서 공유 
	객체 생성 O 			객체 생성 X
	값 변경 X 			값 변경 X
	참조변수.변수명			클래스명.변수명
	객체 생성 시			프로그램 시작 시

*/
