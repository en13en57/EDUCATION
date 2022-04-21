package kr.green.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement(name="boxOfficeResult")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class oBoxOfficeResult2 {
	@XmlElement
	private String boxOfficeType;
	
	@XmlElement
	private String showRange;
	
	@XmlElementWrapper(name="dailyBoxOfficeList")
	@XmlElement(name="dailyBoxOffice")
	private	List<oDailyBoxOffice1> list;
	
}
