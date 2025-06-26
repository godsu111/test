package day0328;

public class SwitchEx04 {
	public static void main(String[] args) {
/*
		break; 사용하지 않을때
		해당 case 에서 대입이 되더라도 빠져나오지않고 
		밑의 실행문 모두 수행한다.
		마지막에 대입된 값이 결과로 나옴.
 */
		int rank = 3;
		char medalColor;
		
		switch (rank) {
			case 1:
				medalColor='G';			
			case 2:
				medalColor='S';
			default:   // if문에서의 else처럼 선택적으로 사용가능하다. else와 다르게 위치가 정해져있지않다.
				medalColor='Y';
			case 3:
				medalColor='B';
				
		}
		System.out.println(rank+"등 메달의 색은 "+medalColor+"입니다.");
	}
}
