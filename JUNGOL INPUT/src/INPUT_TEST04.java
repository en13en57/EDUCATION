/* 입력 - 형성평가4
 * 세 개의 정수를 입력받아 합과 평균을 출력하는 프로그램을 작성하시오.
 * (단 평균은 소수 이하를 버림하여 정수 부분만 출력한다.)
 * 20 50 100
 */

import java.util.Scanner;

public class INPUT_TEST04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println("sum = " + (a+b+c) + "\navg = " + Math.round(a+b+c)/3);

		sc.close();
	}
}