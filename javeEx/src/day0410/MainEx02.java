package day0410;
/*	
    this.변수 			this()
    super.변수
  	super()
  		조상의 기본생성자가 없을 때 조상의 생성자 호출 
  		생성자 내에서만 사용 가능 
  		생성자 내에서 첫번째 줄에 위치해야함
  			: this()와 super()를 같이 사용할 수 없다.
  
 
  	오버라이딩 
		덮어쓰기 
		메서드 -선언부, 구현부
		선언부는 같게, 구현부는 다르게
		접근제어자는 강하게(좁게) 못바꿈(public -> protected/default -> private)
	
	어노테이션
   		@Override -> 오버라이딩
   		구별하기 쉽게 알려주는 역할 
   		생략 가능 
	
	오버로딩	vs 오버라이딩
		오버로딩 	 :	같은 이름 + 매개변수가 다름 (타입 , 순서 , 개수) 
	    오버라이딩	 :	상속 관계 + 선언부까지 같고 구현부가 다름(덮어쓰기)
		
*/

class AA {
	// 인스턴스 변수
	int x;
	
	// 생성자		// new AA(); x=100; / new AA(300); x=300;
//	AA(){
//		this(100);
//	}
	AA(int x){	// 생성자 오버로딩
		this.x = x;
	}
	// 메서드
	void aa() 	// 선언부  
	{			// 구현부 
		System.out.println("조상의 메서드 aa() 호출 : ");
	}
}

class BB extends AA{	// 상속
	// 인스턴스 변수생성
	int y;
	
	// 생성자
	BB(){
		super(300);	// 조상의 기본 생성자를 사용하지 못할 떄
		y=500;
	}
	// 메서드 오버로딩
	void aa(int i) 	// 선언부
	{				// 구현부
		System.out.println("자손의 메서드 aa(오버로딩) 입력값 i : "+i);
	}
	// 메서드 오버라이딩	: 덮어쓰기
	void aa()  		// 선언부 같게
	{				// 구현부만 다르게
		System.out.println("자손이 수정한 aa() 메서드 호출");
	}
	
}
 
public class MainEx02 {
	public static void main(String[] args) {
		BB b =new BB();
		System.out.println(" B의 변수 : "+b.y);
		System.out.println(" A로부터 받은 변수 : "+b.x);
	//	System.out.println(" A에게 받은 메서드 오버라이딩 : "+b.aa()); void 메서드다 return 값이 없음
		b.aa();	// 오버라이딩 한 메서드 호출됨 
	}
}