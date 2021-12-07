import java.util.Scanner;

/* 연산자 - 자가진단7
 * 2개의 정수를 입력 받아서 0이 아니면 참(true), 0이면 거짓(false)으로 처리하고
 * 두 값의 논리곱과 논리합의 결과를 출력하는 프로그램을 작성하시오.
 * ​hint : 정수 a를 입력받은 후 boolean c = (a != 0);을 실행하면 c에 a의 논리값이 저장된다.
 */
public class OPERATOR07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("정수 2개를 입력하시오");
		a = sc.nextInt();
		b = sc.nextInt();

		boolean c = (a != 0);
		boolean d = (b != 0); 
		
		System.out.printf(c + "  " + d);
		
		sc.close();

	}
}
