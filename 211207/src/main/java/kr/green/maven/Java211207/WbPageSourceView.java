package kr.green.maven.Java211207;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class WbPageSourceView {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			URL url = new URL("https://www.naver.com");
			sc = new Scanner(url.openStream());
			
			while(sc.hasNextLine()) { // 다음줄 있으면
				String line = sc.nextLine(); // 1줄 읽기
				System.out.println(line); // 화면에 출력
			}
			System.out.println("읽기완료!");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}

	

