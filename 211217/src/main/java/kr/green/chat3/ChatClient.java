package kr.green.chat3;

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
		try {
			// 2. 소켓을 만들어 접속 한다.
			System.out.println("접속 중 ...");
			socket = new Socket("127.0.0.1", 1004);
			System.out.println("접속 성공 : " + socket);
			
			// 3. 스레드를 시작한다.
			ReceiveThread receiveThread = new ReceiveThread(socket);
			SendThread sendThread = new SendThread(socket);
			
			receiveThread.start();
			sendThread.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			// 5. 닫기
			/*
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			*/
		}
	}
}
