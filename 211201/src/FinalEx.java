// final이
// 변수   앞 변경금지
// 메서드 앞 오버라이딩 금지
// 클래스 앞 상속 금지 



class Parent{
	int i=100;
	final public void show() { // 메서드 앞에 final이 붙으면 오버 라이딩 금지
		System.out.println("i = " + i) ;
	}
}
final class Child extends Parent{ // 클래스 앞에 final이 붙으면 상속 금지
//	public void show() { // 에러! 오버라이딩 금지.(부모 class의 final 때문에)
//		System.out.println("ㅎ하하하ㅏ핳") ;
//	}
}


// class GrandChild extends Child{ // 에러 ! final클래스는 상속 받을 수 없다. Child 클래스 앞에 final이 붙으면 상속 받을 수 없다.
// }	

public class FinalEx {

	static final double PI = 3.14; // 변수 앞에 final이 붙으면 변경 불가
	final static int MAX = 1000; // 변수 앞에 final이 붙으면 변경 불가
	// 일반 변수와 구분하기 위해서 대문자로 표기, 단어사이는 _로 연결한다.

	public static void main(String[] args) {
		// PI = 3.141592; // 에러 - final이라 변경금지!
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.PI);
	
	
	
	}
}
