package kr.green.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement(name = "channel")
@Data
public class NewsChannel2 {
	private String title;
	private String link;
	private String description;
	private List<NewsItem1> item;
}
