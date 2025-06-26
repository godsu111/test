package day0425;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TcpIpCheck {
	public static void main(String[] args) {
		// InetAddress : IP 주소를 표현하는 클래스 
		// ip:port -> 192.168.0.100:8080	-> localhost:8080
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("컴퓨터의 이름 : "+local.getHostName());
			System.out.println("IP 주소 : "+local.getHostAddress());
		} catch (Exception e) {
			System.out.println("IP 조회 실패 : "+e.getMessage());
		}
		
	}
}
