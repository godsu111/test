package day0403;

import java.util.Scanner;

public class ArrayEx11 {
	public static void main(String[] args) {
		int[] nums = { 10, 20, 30, 40, 50, 60 };
		// 배열에 있는 숫자 찾기
		Scanner scanner = new Scanner(System.in);
		// 입력장치 in 사용 <-> 출력장치 out 사용 
		System.out.print("찾는 숫자를 입력해주세요.");
		int input = scanner.nextInt(); // 정수 입력 받기
									   // nextLine() : 문자열 입력받기
		// 찾았나 못찾았나
		boolean found=false;
		for(int num : nums) { // 반복. 배열의 값 꺼내기
			if( num == input) { //꺼낸 값과 입력 값을 비교하기
				System.out.println("찾았습니다.");
				found = true;
				break; // 일치하면 더이상 반복할 필요없음
			}
			System.out.println("찾는중입니다.");
		}
		if(found) {
			System.out.println(input+"은 배열에 있는 숫자입니다.");
		}else {
			System.out.println(input+"은 배열에 없는 숫자입니다.");
		}
		scanner.close();	
	}
}

//		System.out.println("입력해주세요");
//		int num = scanner.nextInt();     // 정수 받기
//		System.out.println("입력값 : "+num);

//		String str = scanner.nextLine(); // 문자열 받기
//		System.out.println("입력값 : "+str);