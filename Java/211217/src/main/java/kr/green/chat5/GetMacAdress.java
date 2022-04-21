package kr.green.chat5;

import java.io.IOException;
import java.util.Scanner;

// 자바에서 외부프로세스 실행하는 방법
public class GetMacAdress {
	public static void main(String[] args) {
		// 1. JDK 1.4이전
		Runtime runtime = Runtime.getRuntime();
		try {
		Process process = null; // 실행결과를 process로 받아 inputStream을 이용하여 Scanner 사용 출력
			process = new ProcessBuilder("cmd", "/c", "ipconfig","/all").start();
			Scanner sc = new Scanner(process.getInputStream(), "MS949");
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				if(line.trim().startsWith("물리")) {
					System.out.println(line.split(":")[1].trim());
				}
			}
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
