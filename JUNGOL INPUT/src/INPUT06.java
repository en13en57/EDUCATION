/* 입력 - 자가진단6
 * 키를 입력받아 출력하는 프로그램을 작성하라.
 * (입력할때 "height = " 문장을 먼저 출력하고 키를 입력 받아야 합니다.)
 * 
 */

import java.util.Scanner;

public class INPUT06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int height;
		System.out.println("\"height = ");
		height = sc.nextInt();
				System.out.println("Your height is " + height + "cm.");
		
		sc.close();
	}
}