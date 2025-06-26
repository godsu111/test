package day0425;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpChatClient {
	public static void main(String[] args) {
		try {
			// Socket	: 서버와 연결을 위한 객체, 서버의 ("ip", port)필요 
			Socket socket = new Socket("192.168.0.31", 8888);	// "ip", port
			System.out.println("[클라이언트] 서버에 접속 완료!");
		
			// 서버로 데이터를 보내기 위한 출력 스트림 (단방향)
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			
			// 콘솔 입력 스트림 생성
			Scanner scanner = new Scanner(System.in);
			// 키보드로 입력한 값(문자열)을 받을 변수
			String input; 
			System.out.println("[클라이언트] 메세지를 입력하세요. 종료하려면 exit를 입력하세요.");
			
			// Upper / Lower / IgnoreCase 대소문자 구분 X 
			while(!(input = scanner.nextLine()).equalsIgnoreCase("exit")) { // scanner.nextLine()으로 받은 문자열을 input에 대입하고 .equlasIhnoreCase(대소문자 구분x)로 exit가 아닌경우 out.println() 문자열 출력
				out.println(input); // 문자열 출력
			}
			
			// 명시적 자원 해제!
			out.close();	// 출력 스트림 닫기
			scanner.close();// 콘솔 입력 스트림 닫기
			socket.close();	// 소켓 닫기
			
		} catch (IOException e) {
			System.out.println("클라이언트 오류 : " + e.getMessage());
		}
	}
}
