package kr.green.vo;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement(name = "rss")
@Data
public class NewsRSS3 {
	private NewsChannel2 channel;
}
