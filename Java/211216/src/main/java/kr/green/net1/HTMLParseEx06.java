package kr.green.net1;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLParseEx06 {
	public static void main(String[] args) {
		// 3. URL 파싱하기
		// 가지고 오고 싶은 정보들 중 제일 큰놈 셀렉 그다음놈 셀렉 그다음놈 셀렉
		// text - 정보 html - attr - 속성
		try {
			Document document = Jsoup.connect("https://fleeckr1.blogspot.com/2015/03/2_7.html").get();
			
			// 코난 만화의 이미지 주소를 알아내 보자
			Elements elements = document.select("div#post-body-5264310367778701161 div"); // . = class			
			System.out.println(elements.size() + "개");
			for(Element div : elements) {
				Elements elements2 = div.select("a img");
				// System.out.println(elements2.size() + "개");
				if(elements2.size()==1) {
					System.out.println("<img src = '" + elements2.get(0).attr("src") + "'/>");
				}
			
			}
			
			
			
			
		
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
}
