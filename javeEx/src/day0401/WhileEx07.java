package day0401;

public class WhileEx07 {
	public static void main(String[] args) {
/* 
  		int a=1; // while문 안에서 사용 할 변수
  		while (){
  			실행코드;
  			증감;
  		}
 */
		// 2단~3단 출력
		int dan=2;
		while( dan<=3 ) {
			//true
			int num=1; // 다시 1로
			while( num<=9 ) {
				System.out.println(dan+"x"+num+"="+dan*num);
				num++;
			}
			dan++;
			System.out.println();
		}
	}
}
