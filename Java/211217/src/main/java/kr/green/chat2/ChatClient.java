package kr.green.chat2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
// 클라이언트의 경우 서버 소켓X 소켓 주소 연결 할 주소로 변경, 보낼메세지 보낸메세지 위아래 바꾸고, 서버소켓 닫기 지우기
// 멍청한 1:1 채팅을 만들어보자. 상대편이 답을 하지 않으면 보내지 못하는 채팅
public class ChatClient {
	public static void main(String[] args) {
		// 1. 변수 준비
		Socket		 socket = null;
		PrintWriter pw = null;
		Scanner     sc = null;
		try {
			// 2. 소켓을 만들어 접속 한다.
			System.out.println("접속 중 ...");
			socket = new Socket("127.0.0.1", 1004);
			System.out.println("접속 성공 : " + socket);
			
			// 3. 통신을 하기 위해 보내고 받는 스트림을 얻는다.
			pw = new PrintWriter(socket.getOutputStream());
			sc = new Scanner(socket.getInputStream());
			// 4. 메세지를 보내고 받기!
			String message = "";
			Scanner userScanner = new Scanner(System.in);
			do {
				// 보내온 메세지를 읽어 출력한다.
				message = sc.nextLine();
				System.out.println("받은 내용 : " + message);
				
				// 보낼 메세지를 입력 받아 보낸다.
				System.out.println("보낼 메세지 입력 : ");
				message = userScanner.nextLine();
				pw.println(message);
				pw.flush();
			}while(message!=null && !message.equals(""));
			userScanner.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			// 5. 닫기
			try {
				sc.close();
				pw.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
