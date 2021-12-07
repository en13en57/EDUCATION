/* 입력 - 자가진단8
 * 실수 2개와 한 개의 문자를 입력 받아 출력하되 
 * 실수는 반올림하여 소수 둘째자리까지 출력하는 프로그램을작성하시오.
 * (C, C++, Java 의 경우 실수는 "double"로 선언하세요.)
 * 
 * 
 */

import java.util.Scanner;

public class INPUT08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 실수 2개와 한개의 문자를 입력하시오");

		double a, b;
		String c;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.next();
		System.out.printf("%.2f\n%.2f\n%s", a, b, c);

		sc.close();
	}
}