// 케스팅 연산
public class Ex06_Casting {
	static int age;
	// 자료형의 형변환
	public static void main(String[] args) {
		byte b = 10;
		System.out.println("b =" + b);
		// 1증가 시키는 여러가지 방법
		b++;
		b += 1;
		// 자바에서 연산을 수행하면 자동으로 int로 변환되어서 연산이 수행된다.
		// b = b + 1;
		// b = (byte)b + 1;
		// b = (byte)b + (byte)1;
		b = (byte)(b + 1); // 강제 형변환 : (데이터타입)값
		System.out.println("b =" + b);
		// 용량이 작은것을 큰것에 넣으면 자동으로 들어간다.들어간다
		// 작은것을 큰것에 넣으려면 형변환을 해주어야 한다. 오버 플로우 발생할 수 있다.
		b = (byte)200;
		System.out.println("b =" + b); // b = -56 : 오버플로우 발생
		
		long l = 123L; // 정수뒤에 L 또는 l이 붙으면 long형 상수이다.
					   // 123은 int타입, 123L은 long타입
		float f = l;   // 가능하다.
					   // long은 8Byte이고 float은 4Byte이지만 에러 아님
					   // 실수는 정수보다 더 큰값을 저장 가능하다.
		System.out.println("l = " + l);
		System.out.println("f = " + f);
	
		int score;
		//System.out.println(score)); // 에러! 초기화 되지 않은 지역 변수는 사용할 수 없다.
		score = 100;
		System.out.println(score);
		// age는 매서드에서 선언한 지역변수가 아니라 클래스에서 선언한 클래스 변수 이므로 자동 초기화 됩니다.
		// 숫자는 0, boolean 은 false, 참조형은null로 초기화 된다.
		System.out.println("나이 : " + age);
		
	}

}
