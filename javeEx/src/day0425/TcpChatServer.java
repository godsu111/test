package day0425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
	소켓 (Socket)
		네트워크에서 데이터를 주고 받기 위한 통신의 종착점(엔드포인트)
		서버와 클라이언트가 연결되면 양쪽에 Socket 객체 생김!
		
	스트림 (Stream)
		InputStream		: 데이터를 읽을 때 사용(들어오는 방향)
		OutputStream	: 데이터를 보낼 때 사용(나가는 방향)
		양방향 통신을 위해서는 두 스트림을 모두 사용해야 함
*/
public class TcpChatServer {
	public static void main(String[] args) {
		try {
			// ServerSocket : 서버에서 클라이언트의 접속을 기다리는 객체
			// 9999번 포트에서 연결 요청
			ServerSocket server = new ServerSocket(9999);
			System.out.println("[서버] 클라이언트 연결 대기중 ....");
			
			
			// .accept() : 클라이언트가 접속할 때 까지 대기하는 메서드
			// 연결이되면 클라이언트와 통신할 수 있는 Socket 객체를 리턴한다.
			Socket client = server.accept();
			System.out.println("[서버] 클라이언트 접속 완료!");
			
			// 클라이언트 -> 서버 데이터를 읽기 위한 입력 스트림(단방향) 
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			// 클라이언트가 보내는 문자열을 한줄씩 읽음(종료 전까지)
			String msg;
			while((msg = in.readLine())!= null) {
				System.out.println("[클라이언트] "+msg);	// 메시지 출력
			}
			// 명시적 닫아줌
			in.close();
			client.close();
			server.close();
			
		} catch (IOException e) {
			System.out.println("서버 오류 : "+e.getMessage());
		}
	}
}
