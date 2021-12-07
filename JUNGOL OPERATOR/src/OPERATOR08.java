import java.util.Scanner;

/* 연산자 - 자가진단8
 * 3개의 정수를 입력 받아 첫 번째 수가 가장 크면 1 아니면 0을 출력하고
 * 세 개의 수가 모두 같으면 1 아니면 0을 출력하는 프로그램을 작성하시오.
 * (JAVA는 1이면 true, 0이면 false를 출력한다.)
 */
public class OPERATOR08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("정수 3개를 입력하시오");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
				
		
		boolean d = (a > b) && (a > c);
		boolean e = (a == b) && (b == c);
		 
		
		System.out.printf(d + "  " + e);
		
		sc.close();

	}
}
