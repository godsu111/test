package day0422;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx02 {
	public static void main(String[] args) {
		// 객체 생성
		HashMap<String,String> hm = new HashMap<String,String>();
		
		// 값 추가
		hm.put("java", "1234");
		hm.put("jsp", "5678");
		hm.put("html", "1234"); // 값 중복 허용
		hm.put("html", 	"9999"); // 키가 같으므로 값 덮어쓰기
		System.out.println("id=pw 목록 : "+hm);
		
		// 입력장치 객체생성
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.println("아이디 : ");
			String id = s.nextLine().trim(); // 앞뒤 공백 제거
			
			System.out.println("비밀번호 : ");
			String pw =s.nextLine().trim();
			
			if(!hm.containsKey(id)) { // key 없음
				System.out.println("존재하지 않는 아이디입니다.");
				System.out.println();
				continue;
			}else {// key 존재
				if(!hm.get(id).equals(pw)) { // 입력한 id의 값과 입력한 pw 비교
					System.out.println("비밀번호가 일치하지 않습니다.");
					System.out.println();
				}else { // id의 value와 입력한 pw값 일치
					System.out.println("아이디와 비밀번호가 일치합니다.");
					System.out.println("로그인 성공~");
					break; // while 문 종료
				}
			}
		}	
	}
}


