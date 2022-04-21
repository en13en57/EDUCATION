import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ParseHTMLEx01 {
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("https://www.naver.com/").get();
		  System.out.println(doc.title());
	
	}
}
