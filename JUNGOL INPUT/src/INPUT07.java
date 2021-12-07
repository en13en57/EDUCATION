/* 입력 - 자가진단7
 * 두 개의 정수를 입력 받아 곱과 몫을 출력하시오.
 * (먼저 입력 받는 수가 항상 크며 입력되는 두 정수는 1이상 500이하이다.)
 * 
 */



import java.util.Scanner;

public class INPUT07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 정수를 입력하여 주세요");
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		if(a<b) System.out.println("먼저 입력 받는 수가 항상 커야 합니다.");
		if(a>500) System.out.println("500 이하여야 합니다.");
		System.out.println(a + " * " + b + " = " + a*b);
		System.out.println(a + " / " + b + " = " + a/b);
		sc.close();
	}
}