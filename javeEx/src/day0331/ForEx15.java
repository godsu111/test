package day0331;

public class ForEx15 {
	public static void main(String[] args) {
		// 1~30까지 반복, 3의 배수 이면서 짝수만 출력
		for(int a=1; a<=30; a++) {
			if(a%3==0) { //3의 배수
				if(a%2==0) { //짝수
					System.out.println(a+"은/는 3의 배수이면서 짝수입니다.");
				}
			}
		}
	}
}
/* 다른방법
  			for(int a=1; a<=30; a++) {
				if(a%3==0 && a%2==0 ) {
					System.out.println(a);
				}
}*/