package kr.green.vo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="language")
public class Language {
	private pName name;
	private String category;
	private String developer;
	private pVersion version;
	private pPriority priority;
	public pName getName() {
		return name;
	}
	public void setName(pName name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDeveloper() {
		return developer;
	}
	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	public pVersion getVersion() {
		return version;
	}
	public void setVersion(pVersion version) {
		this.version = version;
	}
	public pPriority getPriority() {
		return priority;
	}
	public void setPriority(pPriority priority) {
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "Language [name=" + name + ", category=" + category + ", developer=" + developer + ", version=" + version
				+ ", priority=" + priority + "]";
	}

}
