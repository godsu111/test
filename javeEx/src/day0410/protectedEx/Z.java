package day0410.protectedEx;

import day0410.P;	// 다른 패키지의 클래스에 접근할 때 사용 

public class Z extends P {
	Z(){
		super();	// 다른 패키지 + protected 라서 new 불가능, 조상의 생성자 호출
		this.var="value";
		this.methodP();
	}
}
