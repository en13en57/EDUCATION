package kr.green.maven.Java211207;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class OnepieceDownload {
	public static void main(String[] args) {
		String urlAddress = "http://fleeckr1.blogspot.com/2015/03/1_7.html";
		
		
		
		try {
			Document document = Jsoup.connect(urlAddress).get();
			// class 아니면 . 대신 #
			Elements elements = document.select("div.wrapper img");
			System.out.println(elements.size() + "장!");
			int count = 0;
			byte[] data = new byte[10000];
			for(Element e : elements) {
				// System.out.println(e.attr("data-original"));
				InputStream is = new URL(e.attr("src")).openStream();
				
				// 폴더를 자동으로 만들자
				File file = new File("onepiece"); // 파일 객체 생성
				if(!file.exists()) { // 파일이 없다면
					file.mkdirs(); // 폴더를 만들어라
				}
				
				FileOutputStream fos = new FileOutputStream("conan2/" + String.format("%03d.jpg", ++count));
				int n=0;
				while((n=is.read(data))>0) {
					fos.write(data, 0, n);
					fos.flush();
				}
				is.close();
				fos.close();
				System.out.println(count + "번째 그림 저장 완료");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
