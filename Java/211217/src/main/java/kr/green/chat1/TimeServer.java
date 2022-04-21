package kr.green.chat1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// 타임 서버는 접속하는 모든 컴퓨터에게 시간을 알려준다.
public class TimeServer {
	public static void main(String[] args) {
	
		
		ServerSocket serverSocket = null;
		try {
			// 1. 포트 번호를 1개 열어 서버 소켓을 만든다.
			serverSocket = new ServerSocket(10004);
			// 2. 클라이언트의 접속을 기다린다.
			// 3. 접속되면 소켓 객체를 리턴한다.
			System.out.println("10004번 포트를 열어 접속을 대기 중입니다....");
			while(true) {
				Socket clientSocket = serverSocket.accept(); 
				System.out.println("접속 성공 : " + clientSocket);
				// 4. 리턴된 소켓으로 통신을 한다.
				/*
				InputStream is = clientSocket.getInputStream(); // 받기
				Scanner sc = new Scanner(is,"UTF-8");
				String message = sc.nextLine();
				System.out.println("받은내용 : " + message);
				*/
				OutputStream os = clientSocket.getOutputStream(); // 보내기
				PrintWriter pw = new PrintWriter(os);
				// 시간을 보낸다.
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.S");
				pw.write(sdf.format(new Date()) + "\n");
				pw.flush();
				pw.close();
				clientSocket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			// 5. 닫기
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
