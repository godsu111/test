package day0409;
// 공유되는 고정 값(static final) -> 객체생성 x, 값 변경 X
class SFin{
	final int X = 100;
	static final int Y = 500;
	final int Z;
	static int s;
	
	static {
		s = 10;  // static{}으로 초기화 가능 static 변수는
	}
	SFin(int z){ // final 변수 Z 초기화
		this.Z = z;
	}
}

public class StaticFinal02 {
	public static void main(String[] args) {
//	    SFin.Y = 10; final 이 있기 때문에 값 변경 불가
		SFin.s = 20; // static은 값 변경 가능
		
		SFin s = new SFin(500);
//		s.X = 200; final 변수이므로 값 변경 불가
//		s.X++; 	   변수의 값을 바꾸는 모든 행위 불가
		System.out.println("final 변수 X, Z : "+s.X+", "+s.Z);
	}
}
