package kr.green.vo;
/*
 
 <response>
 
 
 
 
 */

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement(name="response")
@Data
public class Covid19Response {
	private Covid19Body body;
}
