package kr.green.net1;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLParseEx07 {
	public static void main(String[] args) {
		// 3. URL 파싱하기
		// 가지고 오고 싶은 정보들 중 제일 큰놈 셀렉 그다음놈 셀렉 그다음놈 셀렉
		// text - 정보 html - attr - 속성
		try {
			Document document = Jsoup.connect("https://m.news.naver.com/covid19/index").get();
			
			// 코난 만화의 이미지 주소를 알아내 보자
			Elements elements = document.select("dd.desc"); // . = class			
			System.out.println(elements.size() + "개");
			System.out.println("신규 확진환자 : " + elements.get(0).text());
			System.out.println("누적 확진환자 : " + elements.get(1).text());
			System.out.println("누적 사망환자 : " + elements.get(2).text());
		
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
}
