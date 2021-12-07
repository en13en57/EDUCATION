
public class Ex01 {
	// 절대 컴퓨터는 믿을 수 없는 놈이다.
	// ★이중확인 절대 필요
	
	// 변수 : 변하는 데이터값을 임시로 저장할 기억 장소의 별칭으로 선언하면 메모리에 지정바이트 만큼 공간을 확보한다.
	
	/* 값 - 문자 char
		 - 숫자 - 정수 - byte, short, int(integer), long
		      - 실수 - float, double
		논리 - boolean */
	
	public static void main(String[] args) {
		// byte b = 126; // 자료형(Data Type)		System.out.println("byte타입의 크기 : " + Byte.BYTES);을 너무 적게 지정하였다.
						 // 자료형이란 그릇의 종류이고, 그릇은 변수명 이다.
		int b = 126;
		System.out.println("b = " + b);
		b++; // 1증가
		System.out.println("b = " + b);
		//  = : 대입연산자
		// == : 상등(같다) 연산자
		// != : 같지않다
		b++; // = b = b + 1;
		System.out.println("b = " + b); // 오버 플로우 (byte 를 사용할 경우 127+1 에서 8번째 자리의 1을 음수로 인식하고, 2의 보수에 의한 방법으로 -128 의 값이 나옴
		b--; // 1감소
		System.out.println("b = " + b);
		
		System.out.println("byte타입의 크기 : " + Byte.BYTES);
		System.out.print("byte타입의 저장 범위 : ");
		System.out.println(Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);

		System.out.println("byte타입의 크기 : " + Integer.BYTES);
		System.out.print("byte타입의 저장 범위 : ");
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
	
	}
}
