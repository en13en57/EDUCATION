import java.util.Scanner;

/* 연산자 - 자기진단1
 * 세 개의 정수를 입력 받아서 합계와 평균을 출력하시오.
 * (단 평균은 소수 이하를 버리고 정수부분만 출력한다.)
 * 
 * 10 25 33
 * 
 * sum : 68
 * avg : 22
 * 
 * 
 */
public class OPERATOR01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println("sum : " + (a + b + c));
		System.out.println("avg : " + (a + b + c) / 3);

		sc.close();
	}
}
