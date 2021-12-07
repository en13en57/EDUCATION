/* 입력 - 형성평가1
 * 세 개의 정수형 변수를 선언하고 각 변수에 10 20 30을 대입한 후 
 * 그 변수를 이용하여 출력 예와 같이 출력하는 프로그램을 작성하시오
 * 10 + 20 = 30
 */

import java.util.Scanner;

public class INPUT_TEST01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println(a + " + " + b + " = " + c);

		sc.close();
	}
}