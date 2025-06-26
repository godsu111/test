package day0415;

public class Nested00 {}
/*
 	중첩 클래스(Nested class)
 		클래스 내부에 선언된 또 다른 클래스
 		클래스-클래스 간의 관계를 좁은 범위로 지정할 때 사용
 		외부 클래스와 밀접한 관계일 때 중첩해서 선언
 		
	선언된 위치에 따른 중첩 클래스 종류
	1. 멤버 클래스(클래스 안에 선언) - 클래스의 멤버처럼 사용
		1-1. 인스턴스 멤버 클래스
				외부 클래스의 객체가 있어야 사용 가능
				정적(static) 멤버(변수,메서드)는 만들 수 없음
					:static final 상수는 가능
			
			class Outer{
				class Inner{
					정적 멤버 사용 불가
				}
			}
					
		1-2. 정적(static) 멤버 클래스
				외부 클래스의 객체 없이도 사용 가능
				정적(static) 멤버(변수,메서드)를 만들 수 있음
			
			class Outer{
				class static SInner{
					static int a=10;
					static void methodA(){}
				}
			}
	
	
	2. 로컬(지역) 클래스(메서드 안에 선언)
 		지역 변수처럼 메서드 안에서'만' 사용 가능
 		메서드를 실행 중에'만' 존재
 		정적 멤버를 사용할 수 없음, static final 상수 사용가능
 		
 		class Outer{
 			void method(){
 				class Local{
 					void local(){
 					}
 				}
 				Local lo = new Local();
 				lo.local();
 			}
 		}
*/