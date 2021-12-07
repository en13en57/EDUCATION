package kr.green.app;
import java.util.Date;

import kr.green.ex01.MyUtil;

/* 파스칼 표기법 - 2단어중 첫글자 대문자
   카멜 표기법 - (메소드명/class명) 3문자중 첫단어 첫 소문자 둘셋단어 첫 대문자
   헝가리언 표기법 - 변수명 앞 자료명 표기 int iMath = 50;
								str strName = "홍길동";
	스네이크 표기법 - 단어간 구분을위해 언더바 사용
	케밥 표기법 - 언더바 대신 미들바 사용
*/

// 클래스이름으로 .java를 붙여서 저장해야 하고
public class Ex01 {
	// 실행이 되려면 반드시 main method가 존재해야 한다.
	// main method는 프로그램의 시작점이다.
	// public static void main(String[] args) {	
	public static void main(String...args) {
		System.out.println("Hello World!!!");
		say("한사람");
		MyUtil.getKB2Byte(20);
	}
	public static void say(String name) {
		System.out.println(name + "씨 반가워요!!!");
		System.out.println("오늘 :" + new Date().toLocaleString());
	}
}
