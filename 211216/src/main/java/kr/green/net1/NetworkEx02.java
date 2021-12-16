package kr.green.net1;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class NetworkEx02 {
	public static void main(String[] args) {
		//               프로토콜   호스트명       포트  서버 경로 (? 뒤에 query로 구분)
		String address = "https://search.naver.com:8080/search.naver?sm=tab_hty.top&where=nexearch&query=%EA%BD%83%EB%B0%B0%EB%8B%AC&oquery=JSP&tqi=hkrS1dp0Jy0ssPqHfAwssssssTw-488509";
		// String address = "https://sir.kr/guin/4347"; // 레스트 풀
		try {
			URL url = new URL(address);
			
			System.out.println(url.getProtocol()); // 프로토콜(통신규약)을 알아낸다.
			System.out.println(url.getHost()); // 호스트명을 알아낸다.
			System.out.println(url.getPort()); // 열려진 포트번호를 알아낸다.(webServer의 기본포트 80)
											   // port번호가 80이 아닌경우는 "호스트이름:포트번호"로 접근
			System.out.println(url.getPath()); // 서버의 경로를 알려준다.
			System.out.println(url.getFile()); // 파일명을 알려준다.
			System.out.println(url.getQuery()); // 요청정보를 알려준다.
			// url주소는 자동으로 인코딩 된다. (한글같은경우 ex)꽃배달) 내용을 보려면 디코딩을 해야한다.
			System.out.println(URLDecoder.decode(url.getQuery(),"UTF-8" )); // 요청정보를 알려준다.

			// 인코딩/디코딩하는 방법
			String name = "한사람";
			String encodeStr = URLEncoder.encode(name,"UTF-8");
			String decodeStr = URLDecoder.decode(encodeStr,"UTF-8");
			System.out.println();
			System.out.println(name + " : " + encodeStr + " : " + decodeStr );
			
			// 요청 정보를 분석해 보자
			String queryStr[] = URLDecoder.decode(url.getQuery(),"UTF-8").split("&");
			for(String query : queryStr) {
				System.out.println(Arrays.toString(query.split("=")));
			}
			
			URL url2 = new URL("https", "www.naver.com",8080, "/board/list.jsp?idx=123");
			System.out.println(url2.toString());
			
			// 웹페이지 소스를 얻어보자
			URL url3 = new URL("https://sir.kr/guin/4347");
			Scanner sc = new Scanner(url3.openStream(), "UTF-8"); // URl객체의 openStream을 이용하여 스트림을 만들어 읽기
			while(sc.hasNextLine())
				System.out.println(sc.nextLine());
			sc.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
